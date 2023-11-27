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

// Gets details about a specific directory role collection.
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
//			_, err := btp.LookupDirectoryRoleCollection(ctx, &btp.LookupDirectoryRoleCollectionArgs{
//				DirectoryId: "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
//				Name:        "Directory Administrator",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupDirectoryRoleCollection(ctx *pulumi.Context, args *LookupDirectoryRoleCollectionArgs, opts ...pulumi.InvokeOption) (*LookupDirectoryRoleCollectionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDirectoryRoleCollectionResult
	err := ctx.Invoke("btp:index/getDirectoryRoleCollection:getDirectoryRoleCollection", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDirectoryRoleCollection.
type LookupDirectoryRoleCollectionArgs struct {
	// The ID of the directory.
	DirectoryId string `pulumi:"directoryId"`
	// The name of the role collection.
	Name string `pulumi:"name"`
}

// A collection of values returned by getDirectoryRoleCollection.
type LookupDirectoryRoleCollectionResult struct {
	// The description of the role collection.
	Description string `pulumi:"description"`
	// The ID of the directory.
	DirectoryId string `pulumi:"directoryId"`
	// The ID of the directory.
	//
	// Deprecated: Use the `directory_id` attribute instead
	Id string `pulumi:"id"`
	// The name of the role collection.
	Name string `pulumi:"name"`
	// Shows whether the role collection is read-only.
	ReadOnly bool                             `pulumi:"readOnly"`
	Roles    []GetDirectoryRoleCollectionRole `pulumi:"roles"`
}

func LookupDirectoryRoleCollectionOutput(ctx *pulumi.Context, args LookupDirectoryRoleCollectionOutputArgs, opts ...pulumi.InvokeOption) LookupDirectoryRoleCollectionResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDirectoryRoleCollectionResult, error) {
			args := v.(LookupDirectoryRoleCollectionArgs)
			r, err := LookupDirectoryRoleCollection(ctx, &args, opts...)
			var s LookupDirectoryRoleCollectionResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupDirectoryRoleCollectionResultOutput)
}

// A collection of arguments for invoking getDirectoryRoleCollection.
type LookupDirectoryRoleCollectionOutputArgs struct {
	// The ID of the directory.
	DirectoryId pulumi.StringInput `pulumi:"directoryId"`
	// The name of the role collection.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupDirectoryRoleCollectionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDirectoryRoleCollectionArgs)(nil)).Elem()
}

// A collection of values returned by getDirectoryRoleCollection.
type LookupDirectoryRoleCollectionResultOutput struct{ *pulumi.OutputState }

func (LookupDirectoryRoleCollectionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDirectoryRoleCollectionResult)(nil)).Elem()
}

func (o LookupDirectoryRoleCollectionResultOutput) ToLookupDirectoryRoleCollectionResultOutput() LookupDirectoryRoleCollectionResultOutput {
	return o
}

func (o LookupDirectoryRoleCollectionResultOutput) ToLookupDirectoryRoleCollectionResultOutputWithContext(ctx context.Context) LookupDirectoryRoleCollectionResultOutput {
	return o
}

func (o LookupDirectoryRoleCollectionResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupDirectoryRoleCollectionResult] {
	return pulumix.Output[LookupDirectoryRoleCollectionResult]{
		OutputState: o.OutputState,
	}
}

// The description of the role collection.
func (o LookupDirectoryRoleCollectionResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDirectoryRoleCollectionResult) string { return v.Description }).(pulumi.StringOutput)
}

// The ID of the directory.
func (o LookupDirectoryRoleCollectionResultOutput) DirectoryId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDirectoryRoleCollectionResult) string { return v.DirectoryId }).(pulumi.StringOutput)
}

// The ID of the directory.
//
// Deprecated: Use the `directory_id` attribute instead
func (o LookupDirectoryRoleCollectionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDirectoryRoleCollectionResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the role collection.
func (o LookupDirectoryRoleCollectionResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDirectoryRoleCollectionResult) string { return v.Name }).(pulumi.StringOutput)
}

// Shows whether the role collection is read-only.
func (o LookupDirectoryRoleCollectionResultOutput) ReadOnly() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDirectoryRoleCollectionResult) bool { return v.ReadOnly }).(pulumi.BoolOutput)
}

func (o LookupDirectoryRoleCollectionResultOutput) Roles() GetDirectoryRoleCollectionRoleArrayOutput {
	return o.ApplyT(func(v LookupDirectoryRoleCollectionResult) []GetDirectoryRoleCollectionRole { return v.Roles }).(GetDirectoryRoleCollectionRoleArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDirectoryRoleCollectionResultOutput{})
}