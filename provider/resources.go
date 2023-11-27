// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

//go:generate go run generate.go
package btp

import (
	_ "embed"
	"fmt"
	"path/filepath"
	"strings"

	shimprovider "github.com/SAP/terraform-provider-btp/shim"
	"github.com/ettle/strcase"
	"github.com/lechnerc77/pulumi-btp/provider/pkg/version"
	pf "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"
)

//go:embed cmd/pulumi-resource-btp/bridge-metadata.json
var bridgeMetadata []byte

// all of the token components used below.
const (
	// This variable controls the default name of the package in the package
	mainMod = "index" // the btp module
)

func convertName(name string) string {
	idx := strings.Index(name, "_")
	contract.Assertf(idx > 0 && idx < len(name)-1, "Invalid snake case name %s", name)
	name = name[idx+1:]
	contract.Assertf(len(name) > 0, "Invalid snake case name %s", name)
	return strcase.ToPascal(name)
}

func makeDataSource(mod string, name string) tokens.ModuleMember {
	name = convertName(name)
	return tfbridge.MakeDataSource("btp", mod, "get"+name)
}

func makeResource(mod string, res string) tokens.Type {
	return tfbridge.MakeResource("btp", mod, convertName(res))
}

// preConfigureCallback is called before the providerConfigure function of the underlying provider.
// It should validate that the provider can be configured, and provide actionable errors in the case
// it cannot be. Configuration variables can be read from `vars` using the `stringValue` function -
// for example `stringValue(vars, "accessKey")`.
func preConfigureCallback(vars resource.PropertyMap, c shim.ResourceConfig) error {
	return nil
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := pf.ShimProvider(shimprovider.NewProvider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:    p,
		Name: "btp",
		// DisplayName is a way to be able to change the casing of the provider
		// name when being displayed on the Pulumi registry
		DisplayName: "(Unoffical) Pulumi Provider for SAP BTP",
		// The default publisher for all packages is Pulumi.
		// Change this to your personal name (or a company name) that you
		// would like to be shown in the Pulumi Registry if this package is published
		// there.
		Publisher: "lechnerc77",
		// LogoURL is optional but useful to help identify your package in the Pulumi Registry
		// if this package is published there.
		//
		// You may host a logo on a domain you control or add an SVG logo for your package
		// in your repository and use the raw content URL for that file as your logo URL.
		LogoURL: "https://raw.githubusercontent.com/lechnerc77/pulumi-btp/main/docs/btp.png",
		// PluginDownloadURL is an optional URL used to download the Provider
		// for use in Pulumi programs
		// e.g https://github.com/org/pulumi-provider-name/releases/
		PluginDownloadURL: "github://api.github.com/lechnerc77/pulumi-btp",
		Description:       "A Pulumi package for creating and managing Btp resources",
		// category/cloud tag helps with categorizing the package in the Pulumi Registry.
		// For all available categories, see `Keywords` in
		// https://www.pulumi.com/docs/guides/pulumi-packages/schema/#package.
		Keywords: []string{
			"pulumi",
			"btp",
			"category/cloud",
		},
		License:    "Apache-2.0",
		Homepage:   "https://github.com/lechnerc77/pulumi-btp",
		Repository: "https://github.com/lechnerc77/pulumi-btp",
		// The GitHub Org for the provider - defaults to `terraform-providers`. Note that this
		// should match the TF provider module's require directive, not any replace directives.
		Version:      version.Version,
		GitHubOrg:    "SAP",
		MetadataInfo: tfbridge.NewProviderMetadata(bridgeMetadata),
		Config:       map[string]*tfbridge.SchemaInfo{
			// Add any required configuration here, or remove the example below if
			// no additional points are required.
			// "region": {
			// 	Type: tfbridge.MakeType("region", "Region"),
			// 	Default: &tfbridge.DefaultInfo{
			// 		EnvVars: []string{"AWS_REGION", "AWS_DEFAULT_REGION"},
			// 	},
			// },
		},
		PreConfigureCallback: preConfigureCallback,
		Resources: map[string]*tfbridge.ResourceInfo{
			"btp_directory":                                {Tok: makeResource(mainMod, "btp_directory")},
			"btp_directory_entitlement":                    {Tok: makeResource(mainMod, "btp_directory_entitlement")},
			"btp_directory_role_collection":                {Tok: makeResource(mainMod, "btp_directory_role_collection")},
			"btp_directory_role_collection_assignment":     {Tok: makeResource(mainMod, "btp_directory_role_collection_assignment")},
			"btp_globalaccount_resource_provider":          {Tok: makeResource(mainMod, "btp_globalaccount_resource_provider")},
			"btp_globalaccount_role_collection":            {Tok: makeResource(mainMod, "btp_globalaccount_role_collection")},
			"btp_globalaccount_role_collection_assignment": {Tok: makeResource(mainMod, "btp_globalaccount_role_collection_assignment")},
			"btp_globalaccount_trust_configuration":        {Tok: makeResource(mainMod, "btp_globalaccount_trust_configuration")},
			"btp_subaccount":                               {Tok: makeResource(mainMod, "btp_subaccount")},
			"btp_subaccount_entitlement":                   {Tok: makeResource(mainMod, "btp_subaccount_entitlement")},
			"btp_subaccount_environment_instance":          {Tok: makeResource(mainMod, "btp_subaccount_environment_instance")},
			"btp_subaccount_role_collection":               {Tok: makeResource(mainMod, "btp_subaccount_role_collection")},
			"btp_subaccount_role_collection_assignment":    {Tok: makeResource(mainMod, "btp_subaccount_role_collection_assignment")},
			"btp_subaccount_service_binding":               {Tok: makeResource(mainMod, "btp_subaccount_service_binding")},
			"btp_subaccount_service_instance":              {Tok: makeResource(mainMod, "btp_subaccount_service_instance")},
			"btp_subaccount_subscription":                  {Tok: makeResource(mainMod, "btp_subaccount_subscription")},
			"btp_subaccount_trust_configuration":           {Tok: makeResource(mainMod, "btp_subaccount_trust_configuration")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"btp_directory":                          {Tok: makeDataSource(mainMod, "btp_directory")},
			"btp_directory_entitlements":             {Tok: makeDataSource(mainMod, "btp_directory_entitlements")},
			"btp_directory_labels":                   {Tok: makeDataSource(mainMod, "btp_directory_labels")},
			"btp_directory_role":                     {Tok: makeDataSource(mainMod, "btp_directory_role")},
			"btp_directory_role_collection":          {Tok: makeDataSource(mainMod, "btp_directory_role_collection")},
			"btp_directory_role_collections":         {Tok: makeDataSource(mainMod, "btp_directory_role_collections")},
			"btp_directory_roles":                    {Tok: makeDataSource(mainMod, "btp_directory_roles")},
			"btp_directory_user":                     {Tok: makeDataSource(mainMod, "btp_directory_user")},
			"btp_directory_users":                    {Tok: makeDataSource(mainMod, "btp_directory_users")},
			"btp_globalaccount":                      {Tok: makeDataSource(mainMod, "btp_globalaccount")},
			"btp_globalaccount_entitlements":         {Tok: makeDataSource(mainMod, "btp_globalaccount_entitlements")},
			"btp_globalaccount_role":                 {Tok: makeDataSource(mainMod, "btp_globalaccount_role")},
			"btp_globalaccount_role_collection":      {Tok: makeDataSource(mainMod, "btp_globalaccount_role_collection")},
			"btp_globalaccount_role_collections":     {Tok: makeDataSource(mainMod, "btp_globalaccount_role_collections")},
			"btp_globalaccount_roles":                {Tok: makeDataSource(mainMod, "btp_globalaccount_roles")},
			"btp_globalaccount_trust_configuration":  {Tok: makeDataSource(mainMod, "btp_globalaccount_trust_configuration")},
			"btp_globalaccount_trust_configurations": {Tok: makeDataSource(mainMod, "btp_globalaccount_trust_configurations")},
			"btp_globalaccount_user":                 {Tok: makeDataSource(mainMod, "btp_globalaccount_user")},
			"btp_globalaccount_users":                {Tok: makeDataSource(mainMod, "btp_globalaccount_users")},
			"btp_regions":                            {Tok: makeDataSource(mainMod, "btp_regions")},
			"btp_subaccount":                         {Tok: makeDataSource(mainMod, "btp_subaccount")},
			"btp_subaccount_app":                     {Tok: makeDataSource(mainMod, "btp_subaccount_app")},
			"btp_subaccount_apps":                    {Tok: makeDataSource(mainMod, "btp_subaccount_apps")},
			"btp_subaccount_entitlements":            {Tok: makeDataSource(mainMod, "btp_subaccount_entitlements")},
			"btp_subaccount_environment_instance":    {Tok: makeDataSource(mainMod, "btp_subaccount_environment_instance")},
			"btp_subaccount_environment_instances":   {Tok: makeDataSource(mainMod, "btp_subaccount_environment_instances")},
			"btp_subaccount_environments":            {Tok: makeDataSource(mainMod, "btp_subaccount_environments")},
			"btp_subaccount_labels":                  {Tok: makeDataSource(mainMod, "btp_subaccount_labels")},
			"btp_subaccount_role":                    {Tok: makeDataSource(mainMod, "btp_subaccount_role")},
			"btp_subaccount_role_collection":         {Tok: makeDataSource(mainMod, "btp_subaccount_role_collection")},
			"btp_subaccount_role_collections":        {Tok: makeDataSource(mainMod, "btp_subaccount_role_collections")},
			"btp_subaccount_roles":                   {Tok: makeDataSource(mainMod, "btp_subaccount_roles")},
			"btp_subaccount_service_binding":         {Tok: makeDataSource(mainMod, "btp_subaccount_service_binding")},
			"btp_subaccount_service_bindings":        {Tok: makeDataSource(mainMod, "btp_subaccount_service_bindings")},
			"btp_subaccount_service_instance":        {Tok: makeDataSource(mainMod, "btp_subaccount_service_instance")},
			"btp_subaccount_service_instances":       {Tok: makeDataSource(mainMod, "btp_subaccount_service_instances")},
			"btp_subaccount_service_offering":        {Tok: makeDataSource(mainMod, "btp_subaccount_service_offering")},
			"btp_subaccount_service_offerings":       {Tok: makeDataSource(mainMod, "btp_subaccount_service_offerings")},
			"btp_subaccount_service_plan":            {Tok: makeDataSource(mainMod, "btp_subaccount_service_plan")},
			"btp_subaccount_service_plans":           {Tok: makeDataSource(mainMod, "btp_subaccount_service_plans")},
			"btp_subaccount_subscription":            {Tok: makeDataSource(mainMod, "btp_subaccount_subscription")},
			"btp_subaccount_subscriptions":           {Tok: makeDataSource(mainMod, "btp_subaccount_subscriptions")},
			"btp_subaccount_trust_configuration":     {Tok: makeDataSource(mainMod, "btp_subaccount_trust_configuration")},
			"btp_subaccount_trust_configurations":    {Tok: makeDataSource(mainMod, "btp_subaccount_trust_configurations")},
			"btp_subaccount_user":                    {Tok: makeDataSource(mainMod, "btp_subaccount_user")},
			"btp_subaccount_users":                   {Tok: makeDataSource(mainMod, "btp_subaccount_users")},
			"btp_subaccounts":                        {Tok: makeDataSource(mainMod, "btp_subaccounts")},
			"btp_whoami":                             {Tok: makeDataSource(mainMod, "btp_whoami")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			PackageName: "@lechnerc77/pulumi-btp",

			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			// See the documentation for tfbridge.OverlayInfo for how to lay out this
			// section, or refer to the AWS provider. Delete this section if there are
			// no overlay files.
			//Overlay: &tfbridge.OverlayInfo{},
		},
		Python: &tfbridge.PythonInfo{
			PackageName: "lechnerc77_pulumi_btp",

			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/lechnerc77/pulumi-%[1]s/sdk/", "btp"),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				"btp",
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RootNamespace: "Lechnerc77-pulumi-btp",

			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		},
		Java: &tfbridge.JavaInfo{
			BasePackage: "com.lechnerc77.pulumi.btp",
		},
	}

	prov.SetAutonaming(255, "-")

	return prov
}
