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

// Shows registered users in a global account. Users belong to one of the identity providers (IdPs) of the global account.
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
//			_, err := btp.GetGlobalaccountUser(ctx, &btp.GetGlobalaccountUserArgs{
//				UserName: "john.doe@mycompany.com",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = btp.GetGlobalaccountUser(ctx, &btp.GetGlobalaccountUserArgs{
//				Origin:   pulumi.StringRef("my-custom-idp"),
//				UserName: "jane.doe@mycompany.com",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetGlobalaccountUser(ctx *pulumi.Context, args *GetGlobalaccountUserArgs, opts ...pulumi.InvokeOption) (*GetGlobalaccountUserResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetGlobalaccountUserResult
	err := ctx.Invoke("btp:index/getGlobalaccountUser:getGlobalaccountUser", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGlobalaccountUser.
type GetGlobalaccountUserArgs struct {
	// The identity provider that hosts the user. Only needed for custom identity provider.
	Origin *string `pulumi:"origin"`
	// The username of the user.
	UserName string `pulumi:"userName"`
}

// A collection of values returned by getGlobalaccountUser.
type GetGlobalaccountUserResult struct {
	// Shows if the account is still in use.
	Active bool `pulumi:"active"`
	// The e-mail address of the user.
	Email string `pulumi:"email"`
	// The last name of the user.
	FamilyName string `pulumi:"familyName"`
	// The given name of the user.
	GivenName string `pulumi:"givenName"`
	// The ID of the user.
	Id string `pulumi:"id"`
	// The identity provider that hosts the user. Only needed for custom identity provider.
	Origin string `pulumi:"origin"`
	// The set of role collections, which are assigned to the user.
	RoleCollections []string `pulumi:"roleCollections"`
	// The username of the user.
	UserName string `pulumi:"userName"`
	// The verification status of the user.
	Verified bool `pulumi:"verified"`
}

func GetGlobalaccountUserOutput(ctx *pulumi.Context, args GetGlobalaccountUserOutputArgs, opts ...pulumi.InvokeOption) GetGlobalaccountUserResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetGlobalaccountUserResult, error) {
			args := v.(GetGlobalaccountUserArgs)
			r, err := GetGlobalaccountUser(ctx, &args, opts...)
			var s GetGlobalaccountUserResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetGlobalaccountUserResultOutput)
}

// A collection of arguments for invoking getGlobalaccountUser.
type GetGlobalaccountUserOutputArgs struct {
	// The identity provider that hosts the user. Only needed for custom identity provider.
	Origin pulumi.StringPtrInput `pulumi:"origin"`
	// The username of the user.
	UserName pulumi.StringInput `pulumi:"userName"`
}

func (GetGlobalaccountUserOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGlobalaccountUserArgs)(nil)).Elem()
}

// A collection of values returned by getGlobalaccountUser.
type GetGlobalaccountUserResultOutput struct{ *pulumi.OutputState }

func (GetGlobalaccountUserResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGlobalaccountUserResult)(nil)).Elem()
}

func (o GetGlobalaccountUserResultOutput) ToGetGlobalaccountUserResultOutput() GetGlobalaccountUserResultOutput {
	return o
}

func (o GetGlobalaccountUserResultOutput) ToGetGlobalaccountUserResultOutputWithContext(ctx context.Context) GetGlobalaccountUserResultOutput {
	return o
}

func (o GetGlobalaccountUserResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetGlobalaccountUserResult] {
	return pulumix.Output[GetGlobalaccountUserResult]{
		OutputState: o.OutputState,
	}
}

// Shows if the account is still in use.
func (o GetGlobalaccountUserResultOutput) Active() pulumi.BoolOutput {
	return o.ApplyT(func(v GetGlobalaccountUserResult) bool { return v.Active }).(pulumi.BoolOutput)
}

// The e-mail address of the user.
func (o GetGlobalaccountUserResultOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v GetGlobalaccountUserResult) string { return v.Email }).(pulumi.StringOutput)
}

// The last name of the user.
func (o GetGlobalaccountUserResultOutput) FamilyName() pulumi.StringOutput {
	return o.ApplyT(func(v GetGlobalaccountUserResult) string { return v.FamilyName }).(pulumi.StringOutput)
}

// The given name of the user.
func (o GetGlobalaccountUserResultOutput) GivenName() pulumi.StringOutput {
	return o.ApplyT(func(v GetGlobalaccountUserResult) string { return v.GivenName }).(pulumi.StringOutput)
}

// The ID of the user.
func (o GetGlobalaccountUserResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetGlobalaccountUserResult) string { return v.Id }).(pulumi.StringOutput)
}

// The identity provider that hosts the user. Only needed for custom identity provider.
func (o GetGlobalaccountUserResultOutput) Origin() pulumi.StringOutput {
	return o.ApplyT(func(v GetGlobalaccountUserResult) string { return v.Origin }).(pulumi.StringOutput)
}

// The set of role collections, which are assigned to the user.
func (o GetGlobalaccountUserResultOutput) RoleCollections() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetGlobalaccountUserResult) []string { return v.RoleCollections }).(pulumi.StringArrayOutput)
}

// The username of the user.
func (o GetGlobalaccountUserResultOutput) UserName() pulumi.StringOutput {
	return o.ApplyT(func(v GetGlobalaccountUserResult) string { return v.UserName }).(pulumi.StringOutput)
}

// The verification status of the user.
func (o GetGlobalaccountUserResultOutput) Verified() pulumi.BoolOutput {
	return o.ApplyT(func(v GetGlobalaccountUserResult) bool { return v.Verified }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(GetGlobalaccountUserResultOutput{})
}
