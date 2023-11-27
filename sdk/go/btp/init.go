// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package btp

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/lechnerc77/pulumi-btp/sdk/go/btp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "btp:index/directory:Directory":
		r = &Directory{}
	case "btp:index/directoryEntitlement:DirectoryEntitlement":
		r = &DirectoryEntitlement{}
	case "btp:index/directoryRoleCollection:DirectoryRoleCollection":
		r = &DirectoryRoleCollection{}
	case "btp:index/directoryRoleCollectionAssignment:DirectoryRoleCollectionAssignment":
		r = &DirectoryRoleCollectionAssignment{}
	case "btp:index/globalaccountResourceProvider:GlobalaccountResourceProvider":
		r = &GlobalaccountResourceProvider{}
	case "btp:index/globalaccountRoleCollection:GlobalaccountRoleCollection":
		r = &GlobalaccountRoleCollection{}
	case "btp:index/globalaccountRoleCollectionAssignment:GlobalaccountRoleCollectionAssignment":
		r = &GlobalaccountRoleCollectionAssignment{}
	case "btp:index/globalaccountTrustConfiguration:GlobalaccountTrustConfiguration":
		r = &GlobalaccountTrustConfiguration{}
	case "btp:index/subaccount:Subaccount":
		r = &Subaccount{}
	case "btp:index/subaccountEntitlement:SubaccountEntitlement":
		r = &SubaccountEntitlement{}
	case "btp:index/subaccountEnvironmentInstance:SubaccountEnvironmentInstance":
		r = &SubaccountEnvironmentInstance{}
	case "btp:index/subaccountRoleCollection:SubaccountRoleCollection":
		r = &SubaccountRoleCollection{}
	case "btp:index/subaccountRoleCollectionAssignment:SubaccountRoleCollectionAssignment":
		r = &SubaccountRoleCollectionAssignment{}
	case "btp:index/subaccountServiceBinding:SubaccountServiceBinding":
		r = &SubaccountServiceBinding{}
	case "btp:index/subaccountServiceInstance:SubaccountServiceInstance":
		r = &SubaccountServiceInstance{}
	case "btp:index/subaccountSubscription:SubaccountSubscription":
		r = &SubaccountSubscription{}
	case "btp:index/subaccountTrustConfiguration:SubaccountTrustConfiguration":
		r = &SubaccountTrustConfiguration{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:btp" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"btp",
		"index/directory",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"btp",
		"index/directoryEntitlement",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"btp",
		"index/directoryRoleCollection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"btp",
		"index/directoryRoleCollectionAssignment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"btp",
		"index/globalaccountResourceProvider",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"btp",
		"index/globalaccountRoleCollection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"btp",
		"index/globalaccountRoleCollectionAssignment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"btp",
		"index/globalaccountTrustConfiguration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"btp",
		"index/subaccount",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"btp",
		"index/subaccountEntitlement",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"btp",
		"index/subaccountEnvironmentInstance",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"btp",
		"index/subaccountRoleCollection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"btp",
		"index/subaccountRoleCollectionAssignment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"btp",
		"index/subaccountServiceBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"btp",
		"index/subaccountServiceInstance",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"btp",
		"index/subaccountSubscription",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"btp",
		"index/subaccountTrustConfiguration",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"btp",
		&pkg{version},
	)
}
