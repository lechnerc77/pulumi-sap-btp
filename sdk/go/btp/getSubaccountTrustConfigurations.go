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

// Gets all trust configurations that are configured for your subaccount.
//
// __Tip:__
// You must be viewer or administrator of the subaccount.
//
// __Further documentation:__
// <https://help.sap.com/docs/btp/sap-business-technology-platform/trust-and-federation-with-identity-providers>
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
//			_, err := btp.GetSubaccountTrustConfigurations(ctx, &btp.GetSubaccountTrustConfigurationsArgs{
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
func GetSubaccountTrustConfigurations(ctx *pulumi.Context, args *GetSubaccountTrustConfigurationsArgs, opts ...pulumi.InvokeOption) (*GetSubaccountTrustConfigurationsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSubaccountTrustConfigurationsResult
	err := ctx.Invoke("btp:index/getSubaccountTrustConfigurations:getSubaccountTrustConfigurations", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSubaccountTrustConfigurations.
type GetSubaccountTrustConfigurationsArgs struct {
	// The ID of the subaccount.
	SubaccountId string `pulumi:"subaccountId"`
}

// A collection of values returned by getSubaccountTrustConfigurations.
type GetSubaccountTrustConfigurationsResult struct {
	// The ID of the subaccount.
	//
	// Deprecated: Use the `subaccount_id` attribute instead
	Id string `pulumi:"id"`
	// The ID of the subaccount.
	SubaccountId string `pulumi:"subaccountId"`
	// The trust configurations associated with the subaccount.
	Values []GetSubaccountTrustConfigurationsValue `pulumi:"values"`
}

func GetSubaccountTrustConfigurationsOutput(ctx *pulumi.Context, args GetSubaccountTrustConfigurationsOutputArgs, opts ...pulumi.InvokeOption) GetSubaccountTrustConfigurationsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSubaccountTrustConfigurationsResult, error) {
			args := v.(GetSubaccountTrustConfigurationsArgs)
			r, err := GetSubaccountTrustConfigurations(ctx, &args, opts...)
			var s GetSubaccountTrustConfigurationsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSubaccountTrustConfigurationsResultOutput)
}

// A collection of arguments for invoking getSubaccountTrustConfigurations.
type GetSubaccountTrustConfigurationsOutputArgs struct {
	// The ID of the subaccount.
	SubaccountId pulumi.StringInput `pulumi:"subaccountId"`
}

func (GetSubaccountTrustConfigurationsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSubaccountTrustConfigurationsArgs)(nil)).Elem()
}

// A collection of values returned by getSubaccountTrustConfigurations.
type GetSubaccountTrustConfigurationsResultOutput struct{ *pulumi.OutputState }

func (GetSubaccountTrustConfigurationsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSubaccountTrustConfigurationsResult)(nil)).Elem()
}

func (o GetSubaccountTrustConfigurationsResultOutput) ToGetSubaccountTrustConfigurationsResultOutput() GetSubaccountTrustConfigurationsResultOutput {
	return o
}

func (o GetSubaccountTrustConfigurationsResultOutput) ToGetSubaccountTrustConfigurationsResultOutputWithContext(ctx context.Context) GetSubaccountTrustConfigurationsResultOutput {
	return o
}

func (o GetSubaccountTrustConfigurationsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetSubaccountTrustConfigurationsResult] {
	return pulumix.Output[GetSubaccountTrustConfigurationsResult]{
		OutputState: o.OutputState,
	}
}

// The ID of the subaccount.
//
// Deprecated: Use the `subaccount_id` attribute instead
func (o GetSubaccountTrustConfigurationsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSubaccountTrustConfigurationsResult) string { return v.Id }).(pulumi.StringOutput)
}

// The ID of the subaccount.
func (o GetSubaccountTrustConfigurationsResultOutput) SubaccountId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSubaccountTrustConfigurationsResult) string { return v.SubaccountId }).(pulumi.StringOutput)
}

// The trust configurations associated with the subaccount.
func (o GetSubaccountTrustConfigurationsResultOutput) Values() GetSubaccountTrustConfigurationsValueArrayOutput {
	return o.ApplyT(func(v GetSubaccountTrustConfigurationsResult) []GetSubaccountTrustConfigurationsValue {
		return v.Values
	}).(GetSubaccountTrustConfigurationsValueArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSubaccountTrustConfigurationsResultOutput{})
}