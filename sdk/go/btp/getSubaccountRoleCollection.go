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

// Gets details about a specific subaccount role collection.
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
//			_, err := btp.LookupSubaccountRoleCollection(ctx, &btp.LookupSubaccountRoleCollectionArgs{
//				Name:         "Subaccount Administrator",
//				SubaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupSubaccountRoleCollection(ctx *pulumi.Context, args *LookupSubaccountRoleCollectionArgs, opts ...pulumi.InvokeOption) (*LookupSubaccountRoleCollectionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSubaccountRoleCollectionResult
	err := ctx.Invoke("btp:index/getSubaccountRoleCollection:getSubaccountRoleCollection", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSubaccountRoleCollection.
type LookupSubaccountRoleCollectionArgs struct {
	// The name of the role collection.
	Name string `pulumi:"name"`
	// The ID of the subaccount.
	SubaccountId string `pulumi:"subaccountId"`
}

// A collection of values returned by getSubaccountRoleCollection.
type LookupSubaccountRoleCollectionResult struct {
	// The description of the role collection.
	Description string `pulumi:"description"`
	// The ID of the subaccount.
	//
	// Deprecated: Use the `subaccount_id` attribute instead
	Id string `pulumi:"id"`
	// The name of the role collection.
	Name string `pulumi:"name"`
	// Shows whether the role collection is read-only.
	ReadOnly bool                              `pulumi:"readOnly"`
	Roles    []GetSubaccountRoleCollectionRole `pulumi:"roles"`
	// The ID of the subaccount.
	SubaccountId string `pulumi:"subaccountId"`
}

func LookupSubaccountRoleCollectionOutput(ctx *pulumi.Context, args LookupSubaccountRoleCollectionOutputArgs, opts ...pulumi.InvokeOption) LookupSubaccountRoleCollectionResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSubaccountRoleCollectionResult, error) {
			args := v.(LookupSubaccountRoleCollectionArgs)
			r, err := LookupSubaccountRoleCollection(ctx, &args, opts...)
			var s LookupSubaccountRoleCollectionResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSubaccountRoleCollectionResultOutput)
}

// A collection of arguments for invoking getSubaccountRoleCollection.
type LookupSubaccountRoleCollectionOutputArgs struct {
	// The name of the role collection.
	Name pulumi.StringInput `pulumi:"name"`
	// The ID of the subaccount.
	SubaccountId pulumi.StringInput `pulumi:"subaccountId"`
}

func (LookupSubaccountRoleCollectionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSubaccountRoleCollectionArgs)(nil)).Elem()
}

// A collection of values returned by getSubaccountRoleCollection.
type LookupSubaccountRoleCollectionResultOutput struct{ *pulumi.OutputState }

func (LookupSubaccountRoleCollectionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSubaccountRoleCollectionResult)(nil)).Elem()
}

func (o LookupSubaccountRoleCollectionResultOutput) ToLookupSubaccountRoleCollectionResultOutput() LookupSubaccountRoleCollectionResultOutput {
	return o
}

func (o LookupSubaccountRoleCollectionResultOutput) ToLookupSubaccountRoleCollectionResultOutputWithContext(ctx context.Context) LookupSubaccountRoleCollectionResultOutput {
	return o
}

func (o LookupSubaccountRoleCollectionResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupSubaccountRoleCollectionResult] {
	return pulumix.Output[LookupSubaccountRoleCollectionResult]{
		OutputState: o.OutputState,
	}
}

// The description of the role collection.
func (o LookupSubaccountRoleCollectionResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountRoleCollectionResult) string { return v.Description }).(pulumi.StringOutput)
}

// The ID of the subaccount.
//
// Deprecated: Use the `subaccount_id` attribute instead
func (o LookupSubaccountRoleCollectionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountRoleCollectionResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the role collection.
func (o LookupSubaccountRoleCollectionResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountRoleCollectionResult) string { return v.Name }).(pulumi.StringOutput)
}

// Shows whether the role collection is read-only.
func (o LookupSubaccountRoleCollectionResultOutput) ReadOnly() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupSubaccountRoleCollectionResult) bool { return v.ReadOnly }).(pulumi.BoolOutput)
}

func (o LookupSubaccountRoleCollectionResultOutput) Roles() GetSubaccountRoleCollectionRoleArrayOutput {
	return o.ApplyT(func(v LookupSubaccountRoleCollectionResult) []GetSubaccountRoleCollectionRole { return v.Roles }).(GetSubaccountRoleCollectionRoleArrayOutput)
}

// The ID of the subaccount.
func (o LookupSubaccountRoleCollectionResultOutput) SubaccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountRoleCollectionResult) string { return v.SubaccountId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSubaccountRoleCollectionResultOutput{})
}