// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package btp

import (
	"github.com/lechnerc77/pulumi-btp/sdk/go/btp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Gets all the directories in a global account, including the directories in directories.
//
// __Tip:__
// You must be assigned to the admin or viewer role of the global account, directory.
func GetDirectories(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetDirectoriesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDirectoriesResult
	err := ctx.Invoke("btp:index/getDirectories:getDirectories", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getDirectories.
type GetDirectoriesResult struct {
	// The ID of the global account.
	//
	// Deprecated: Use the `btp_globalaccount` datasource instead
	Id string `pulumi:"id"`
	// The directories contained in the global account.
	Values []GetDirectoriesValue `pulumi:"values"`
}
