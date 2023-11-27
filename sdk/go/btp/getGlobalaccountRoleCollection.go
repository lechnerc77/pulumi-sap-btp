// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package btp

import (
	"context"
	"reflect"

	"github.com/lechnerc77/pulumi-btp/sdk/go/btp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Gets details about a specific global account role collection.
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
//			_, err := btp.LookupGlobalaccountRoleCollection(ctx, &btp.LookupGlobalaccountRoleCollectionArgs{
//				Name: "Global Account Administrator",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupGlobalaccountRoleCollection(ctx *pulumi.Context, args *LookupGlobalaccountRoleCollectionArgs, opts ...pulumi.InvokeOption) (*LookupGlobalaccountRoleCollectionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupGlobalaccountRoleCollectionResult
	err := ctx.Invoke("btp:index/getGlobalaccountRoleCollection:getGlobalaccountRoleCollection", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGlobalaccountRoleCollection.
type LookupGlobalaccountRoleCollectionArgs struct {
	// The name of the role collection.
	Name string `pulumi:"name"`
}

// A collection of values returned by getGlobalaccountRoleCollection.
type LookupGlobalaccountRoleCollectionResult struct {
	// The description of the role collection.
	Description string `pulumi:"description"`
	// The ID of the global account.
	//
	// Deprecated: Use the `btp_globalaccount` datasource instead
	Id string `pulumi:"id"`
	// The name of the role collection.
	Name string `pulumi:"name"`
	// Shows whether the role collection is read-only.
	ReadOnly bool                                 `pulumi:"readOnly"`
	Roles    []GetGlobalaccountRoleCollectionRole `pulumi:"roles"`
}

func LookupGlobalaccountRoleCollectionOutput(ctx *pulumi.Context, args LookupGlobalaccountRoleCollectionOutputArgs, opts ...pulumi.InvokeOption) LookupGlobalaccountRoleCollectionResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupGlobalaccountRoleCollectionResult, error) {
			args := v.(LookupGlobalaccountRoleCollectionArgs)
			r, err := LookupGlobalaccountRoleCollection(ctx, &args, opts...)
			var s LookupGlobalaccountRoleCollectionResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupGlobalaccountRoleCollectionResultOutput)
}

// A collection of arguments for invoking getGlobalaccountRoleCollection.
type LookupGlobalaccountRoleCollectionOutputArgs struct {
	// The name of the role collection.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupGlobalaccountRoleCollectionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGlobalaccountRoleCollectionArgs)(nil)).Elem()
}

// A collection of values returned by getGlobalaccountRoleCollection.
type LookupGlobalaccountRoleCollectionResultOutput struct{ *pulumi.OutputState }

func (LookupGlobalaccountRoleCollectionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGlobalaccountRoleCollectionResult)(nil)).Elem()
}

func (o LookupGlobalaccountRoleCollectionResultOutput) ToLookupGlobalaccountRoleCollectionResultOutput() LookupGlobalaccountRoleCollectionResultOutput {
	return o
}

func (o LookupGlobalaccountRoleCollectionResultOutput) ToLookupGlobalaccountRoleCollectionResultOutputWithContext(ctx context.Context) LookupGlobalaccountRoleCollectionResultOutput {
	return o
}

func (o LookupGlobalaccountRoleCollectionResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupGlobalaccountRoleCollectionResult] {
	return pulumix.Output[LookupGlobalaccountRoleCollectionResult]{
		OutputState: o.OutputState,
	}
}

// The description of the role collection.
func (o LookupGlobalaccountRoleCollectionResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGlobalaccountRoleCollectionResult) string { return v.Description }).(pulumi.StringOutput)
}

// The ID of the global account.
//
// Deprecated: Use the `btp_globalaccount` datasource instead
func (o LookupGlobalaccountRoleCollectionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGlobalaccountRoleCollectionResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the role collection.
func (o LookupGlobalaccountRoleCollectionResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGlobalaccountRoleCollectionResult) string { return v.Name }).(pulumi.StringOutput)
}

// Shows whether the role collection is read-only.
func (o LookupGlobalaccountRoleCollectionResultOutput) ReadOnly() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupGlobalaccountRoleCollectionResult) bool { return v.ReadOnly }).(pulumi.BoolOutput)
}

func (o LookupGlobalaccountRoleCollectionResultOutput) Roles() GetGlobalaccountRoleCollectionRoleArrayOutput {
	return o.ApplyT(func(v LookupGlobalaccountRoleCollectionResult) []GetGlobalaccountRoleCollectionRole { return v.Roles }).(GetGlobalaccountRoleCollectionRoleArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupGlobalaccountRoleCollectionResultOutput{})
}