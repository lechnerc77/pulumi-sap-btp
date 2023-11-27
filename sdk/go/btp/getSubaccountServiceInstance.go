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

// Gets details about a specific provisioned service instance, such as its name, id,  platform to which it belongs, and the last operation performed.
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
//			_, err := btp.LookupSubaccountServiceInstance(ctx, &btp.LookupSubaccountServiceInstanceArgs{
//				Id:           pulumi.StringRef("bc8a216f-1184-49dc-b4b4-17cfe2828965"),
//				SubaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = btp.LookupSubaccountServiceInstance(ctx, &btp.LookupSubaccountServiceInstanceArgs{
//				Name:         pulumi.StringRef("my-xsuaa-application"),
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
func LookupSubaccountServiceInstance(ctx *pulumi.Context, args *LookupSubaccountServiceInstanceArgs, opts ...pulumi.InvokeOption) (*LookupSubaccountServiceInstanceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSubaccountServiceInstanceResult
	err := ctx.Invoke("btp:index/getSubaccountServiceInstance:getSubaccountServiceInstance", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSubaccountServiceInstance.
type LookupSubaccountServiceInstanceArgs struct {
	// The ID of the service instance.
	Id *string `pulumi:"id"`
	// The name of the service instance.
	Name *string `pulumi:"name"`
	// The ID of the subaccount.
	SubaccountId string `pulumi:"subaccountId"`
}

// A collection of values returned by getSubaccountServiceInstance.
type LookupSubaccountServiceInstanceResult struct {
	// Contextual data for the resource.
	Context map[string]string `pulumi:"context"`
	// The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
	CreatedDate string `pulumi:"createdDate"`
	// The ID of the service instance.
	Id string `pulumi:"id"`
	// The set of words or phrases assigned to the service instance.
	Labels map[string][]string `pulumi:"labels"`
	// The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
	LastModified string `pulumi:"lastModified"`
	// The name of the service instance.
	Name string `pulumi:"name"`
	// The configuration parameters for the service instance.
	Parameters string `pulumi:"parameters"`
	// The platform ID.
	PlatformId string `pulumi:"platformId"`
	Ready      bool   `pulumi:"ready"`
	// The ID of the instance to which the service instance refers.
	ReferencedInstanceId string `pulumi:"referencedInstanceId"`
	// The ID of the service plan.
	ServiceplanId string `pulumi:"serviceplanId"`
	// Shows whether the service instance is shared.
	Shared bool `pulumi:"shared"`
	// The current state of the service instance.
	State string `pulumi:"state"`
	// The ID of the subaccount.
	SubaccountId string `pulumi:"subaccountId"`
	// Shows whether the resource can be used.
	Usable bool `pulumi:"usable"`
}

func LookupSubaccountServiceInstanceOutput(ctx *pulumi.Context, args LookupSubaccountServiceInstanceOutputArgs, opts ...pulumi.InvokeOption) LookupSubaccountServiceInstanceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSubaccountServiceInstanceResult, error) {
			args := v.(LookupSubaccountServiceInstanceArgs)
			r, err := LookupSubaccountServiceInstance(ctx, &args, opts...)
			var s LookupSubaccountServiceInstanceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSubaccountServiceInstanceResultOutput)
}

// A collection of arguments for invoking getSubaccountServiceInstance.
type LookupSubaccountServiceInstanceOutputArgs struct {
	// The ID of the service instance.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// The name of the service instance.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The ID of the subaccount.
	SubaccountId pulumi.StringInput `pulumi:"subaccountId"`
}

func (LookupSubaccountServiceInstanceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSubaccountServiceInstanceArgs)(nil)).Elem()
}

// A collection of values returned by getSubaccountServiceInstance.
type LookupSubaccountServiceInstanceResultOutput struct{ *pulumi.OutputState }

func (LookupSubaccountServiceInstanceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSubaccountServiceInstanceResult)(nil)).Elem()
}

func (o LookupSubaccountServiceInstanceResultOutput) ToLookupSubaccountServiceInstanceResultOutput() LookupSubaccountServiceInstanceResultOutput {
	return o
}

func (o LookupSubaccountServiceInstanceResultOutput) ToLookupSubaccountServiceInstanceResultOutputWithContext(ctx context.Context) LookupSubaccountServiceInstanceResultOutput {
	return o
}

func (o LookupSubaccountServiceInstanceResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupSubaccountServiceInstanceResult] {
	return pulumix.Output[LookupSubaccountServiceInstanceResult]{
		OutputState: o.OutputState,
	}
}

// Contextual data for the resource.
func (o LookupSubaccountServiceInstanceResultOutput) Context() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupSubaccountServiceInstanceResult) map[string]string { return v.Context }).(pulumi.StringMapOutput)
}

// The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
func (o LookupSubaccountServiceInstanceResultOutput) CreatedDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountServiceInstanceResult) string { return v.CreatedDate }).(pulumi.StringOutput)
}

// The ID of the service instance.
func (o LookupSubaccountServiceInstanceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountServiceInstanceResult) string { return v.Id }).(pulumi.StringOutput)
}

// The set of words or phrases assigned to the service instance.
func (o LookupSubaccountServiceInstanceResultOutput) Labels() pulumi.StringArrayMapOutput {
	return o.ApplyT(func(v LookupSubaccountServiceInstanceResult) map[string][]string { return v.Labels }).(pulumi.StringArrayMapOutput)
}

// The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
func (o LookupSubaccountServiceInstanceResultOutput) LastModified() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountServiceInstanceResult) string { return v.LastModified }).(pulumi.StringOutput)
}

// The name of the service instance.
func (o LookupSubaccountServiceInstanceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountServiceInstanceResult) string { return v.Name }).(pulumi.StringOutput)
}

// The configuration parameters for the service instance.
func (o LookupSubaccountServiceInstanceResultOutput) Parameters() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountServiceInstanceResult) string { return v.Parameters }).(pulumi.StringOutput)
}

// The platform ID.
func (o LookupSubaccountServiceInstanceResultOutput) PlatformId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountServiceInstanceResult) string { return v.PlatformId }).(pulumi.StringOutput)
}

func (o LookupSubaccountServiceInstanceResultOutput) Ready() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupSubaccountServiceInstanceResult) bool { return v.Ready }).(pulumi.BoolOutput)
}

// The ID of the instance to which the service instance refers.
func (o LookupSubaccountServiceInstanceResultOutput) ReferencedInstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountServiceInstanceResult) string { return v.ReferencedInstanceId }).(pulumi.StringOutput)
}

// The ID of the service plan.
func (o LookupSubaccountServiceInstanceResultOutput) ServiceplanId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountServiceInstanceResult) string { return v.ServiceplanId }).(pulumi.StringOutput)
}

// Shows whether the service instance is shared.
func (o LookupSubaccountServiceInstanceResultOutput) Shared() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupSubaccountServiceInstanceResult) bool { return v.Shared }).(pulumi.BoolOutput)
}

// The current state of the service instance.
func (o LookupSubaccountServiceInstanceResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountServiceInstanceResult) string { return v.State }).(pulumi.StringOutput)
}

// The ID of the subaccount.
func (o LookupSubaccountServiceInstanceResultOutput) SubaccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountServiceInstanceResult) string { return v.SubaccountId }).(pulumi.StringOutput)
}

// Shows whether the resource can be used.
func (o LookupSubaccountServiceInstanceResultOutput) Usable() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupSubaccountServiceInstanceResult) bool { return v.Usable }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSubaccountServiceInstanceResultOutput{})
}