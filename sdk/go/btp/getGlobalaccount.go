// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package btp

import (
	"github.com/lechnerc77/pulumi-btp/sdk/go/btp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Gets details about a global account.
//
// __Tip:__
// You must be assigned to the global account admin or viewer role.
//
// __Further documentation:__
// <https://help.sap.com/docs/btp/sap-business-technology-platform/account-model>
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lechnerc77/pulumi-btp/sdk/go/btp"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := btp.GetGlobalaccount(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetGlobalaccount(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetGlobalaccountResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetGlobalaccountResult
	err := ctx.Invoke("btp:index/getGlobalaccount:getGlobalaccount", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getGlobalaccount.
type GetGlobalaccountResult struct {
	// The type of the commercial contract that was signed.
	CommercialModel string `pulumi:"commercialModel"`
	// Shows whether the customer of the global account pays only for services that they actually use (consumption-based) or pays for subscribed services at a fixed cost irrespective of consumption (subscription-based).
	ConsumptionBased bool `pulumi:"consumptionBased"`
	// The status of the customer contract and its associated root global account. Possible values are:
	ContractStatus string `pulumi:"contractStatus"`
	CostobjectId   string `pulumi:"costobjectId"`
	CostobjectType string `pulumi:"costobjectType"`
	CreatedDate    string `pulumi:"createdDate"`
	CrmCustomerId  string `pulumi:"crmCustomerId"`
	CrmTenantId    string `pulumi:"crmTenantId"`
	Description    string `pulumi:"description"`
	ExpiryDate     string `pulumi:"expiryDate"`
	GeoAccess      string `pulumi:"geoAccess"`
	Id             string `pulumi:"id"`
	LastModified   string `pulumi:"lastModified"`
	LicenseType    string `pulumi:"licenseType"`
	Name           string `pulumi:"name"`
	Origin         string `pulumi:"origin"`
	RenewalDate    string `pulumi:"renewalDate"`
	ServiceId      string `pulumi:"serviceId"`
	State          string `pulumi:"state"`
	Subdomain      string `pulumi:"subdomain"`
	Usage          string `pulumi:"usage"`
}
