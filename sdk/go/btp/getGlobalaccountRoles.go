// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package btp

import (
	"github.com/lechnerc77/pulumi-btp/sdk/go/btp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Lists all roles.
//
// __Further documentation:__
// <https://help.sap.com/docs/btp/sap-business-technology-platform/role-collections-and-roles-in-global-accounts-directories-and-subaccounts>
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
//			_, err := btp.GetGlobalaccountRoles(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetGlobalaccountRoles(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetGlobalaccountRolesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetGlobalaccountRolesResult
	err := ctx.Invoke("btp:index/getGlobalaccountRoles:getGlobalaccountRoles", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getGlobalaccountRoles.
type GetGlobalaccountRolesResult struct {
	// The ID of the global account.
	//
	// Deprecated: Use the `btp_globalaccount` datasource instead
	Id     string                       `pulumi:"id"`
	Values []GetGlobalaccountRolesValue `pulumi:"values"`
}
