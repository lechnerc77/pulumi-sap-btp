// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package btp

import (
	"github.com/lechnerc77/pulumi-btp/sdk/go/btp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Returns information about the logged-in user.
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
//			_, err := btp.GetWhoami(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetWhoami(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetWhoamiResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetWhoamiResult
	err := ctx.Invoke("btp:index/getWhoami:getWhoami", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getWhoami.
type GetWhoamiResult struct {
	// The e-mail address of the logged-in user.
	Email string `pulumi:"email"`
	// The ID of the logged-in user.
	Id string `pulumi:"id"`
	// The name of the token issuer.
	Issuer string `pulumi:"issuer"`
}