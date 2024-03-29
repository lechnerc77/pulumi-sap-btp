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

// Shows registered users in a directory. Users belong to one of the identity providers (IdPs) of the global account.
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
//			_, err := btp.GetDirectoryUser(ctx, &btp.GetDirectoryUserArgs{
//				DirectoryId: "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
//				UserName:    "john.doe@mycompany.com",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = btp.GetDirectoryUser(ctx, &btp.GetDirectoryUserArgs{
//				DirectoryId: "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
//				Origin:      pulumi.StringRef("my-custom-idp"),
//				UserName:    "jane.doe@mycompany.com",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetDirectoryUser(ctx *pulumi.Context, args *GetDirectoryUserArgs, opts ...pulumi.InvokeOption) (*GetDirectoryUserResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDirectoryUserResult
	err := ctx.Invoke("btp:index/getDirectoryUser:getDirectoryUser", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDirectoryUser.
type GetDirectoryUserArgs struct {
	// The ID of the directory.
	DirectoryId string `pulumi:"directoryId"`
	// The identity provider that hosts the user. Only needed for custom identity provider.
	Origin *string `pulumi:"origin"`
	// The username of the user.
	UserName string `pulumi:"userName"`
}

// A collection of values returned by getDirectoryUser.
type GetDirectoryUserResult struct {
	// Shows if the account is still in use.
	Active bool `pulumi:"active"`
	// The ID of the directory.
	DirectoryId string `pulumi:"directoryId"`
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

func GetDirectoryUserOutput(ctx *pulumi.Context, args GetDirectoryUserOutputArgs, opts ...pulumi.InvokeOption) GetDirectoryUserResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDirectoryUserResult, error) {
			args := v.(GetDirectoryUserArgs)
			r, err := GetDirectoryUser(ctx, &args, opts...)
			var s GetDirectoryUserResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDirectoryUserResultOutput)
}

// A collection of arguments for invoking getDirectoryUser.
type GetDirectoryUserOutputArgs struct {
	// The ID of the directory.
	DirectoryId pulumi.StringInput `pulumi:"directoryId"`
	// The identity provider that hosts the user. Only needed for custom identity provider.
	Origin pulumi.StringPtrInput `pulumi:"origin"`
	// The username of the user.
	UserName pulumi.StringInput `pulumi:"userName"`
}

func (GetDirectoryUserOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDirectoryUserArgs)(nil)).Elem()
}

// A collection of values returned by getDirectoryUser.
type GetDirectoryUserResultOutput struct{ *pulumi.OutputState }

func (GetDirectoryUserResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDirectoryUserResult)(nil)).Elem()
}

func (o GetDirectoryUserResultOutput) ToGetDirectoryUserResultOutput() GetDirectoryUserResultOutput {
	return o
}

func (o GetDirectoryUserResultOutput) ToGetDirectoryUserResultOutputWithContext(ctx context.Context) GetDirectoryUserResultOutput {
	return o
}

func (o GetDirectoryUserResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetDirectoryUserResult] {
	return pulumix.Output[GetDirectoryUserResult]{
		OutputState: o.OutputState,
	}
}

// Shows if the account is still in use.
func (o GetDirectoryUserResultOutput) Active() pulumi.BoolOutput {
	return o.ApplyT(func(v GetDirectoryUserResult) bool { return v.Active }).(pulumi.BoolOutput)
}

// The ID of the directory.
func (o GetDirectoryUserResultOutput) DirectoryId() pulumi.StringOutput {
	return o.ApplyT(func(v GetDirectoryUserResult) string { return v.DirectoryId }).(pulumi.StringOutput)
}

// The e-mail address of the user.
func (o GetDirectoryUserResultOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v GetDirectoryUserResult) string { return v.Email }).(pulumi.StringOutput)
}

// The last name of the user.
func (o GetDirectoryUserResultOutput) FamilyName() pulumi.StringOutput {
	return o.ApplyT(func(v GetDirectoryUserResult) string { return v.FamilyName }).(pulumi.StringOutput)
}

// The given name of the user.
func (o GetDirectoryUserResultOutput) GivenName() pulumi.StringOutput {
	return o.ApplyT(func(v GetDirectoryUserResult) string { return v.GivenName }).(pulumi.StringOutput)
}

// The ID of the user.
func (o GetDirectoryUserResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDirectoryUserResult) string { return v.Id }).(pulumi.StringOutput)
}

// The identity provider that hosts the user. Only needed for custom identity provider.
func (o GetDirectoryUserResultOutput) Origin() pulumi.StringOutput {
	return o.ApplyT(func(v GetDirectoryUserResult) string { return v.Origin }).(pulumi.StringOutput)
}

// The set of role collections, which are assigned to the user.
func (o GetDirectoryUserResultOutput) RoleCollections() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDirectoryUserResult) []string { return v.RoleCollections }).(pulumi.StringArrayOutput)
}

// The username of the user.
func (o GetDirectoryUserResultOutput) UserName() pulumi.StringOutput {
	return o.ApplyT(func(v GetDirectoryUserResult) string { return v.UserName }).(pulumi.StringOutput)
}

// The verification status of the user.
func (o GetDirectoryUserResultOutput) Verified() pulumi.BoolOutput {
	return o.ApplyT(func(v GetDirectoryUserResult) bool { return v.Verified }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDirectoryUserResultOutput{})
}
