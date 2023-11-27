// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package btp

import (
	"context"
	"reflect"

	"errors"
	"github.com/lechnerc77/pulumi-btp/sdk/go/btp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Assigns a user or a group to a role collection on global account level.
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
//			_, err := btp.NewGlobalaccountRoleCollectionAssignment(ctx, "jd", &btp.GlobalaccountRoleCollectionAssignmentArgs{
//				RoleCollectionName: pulumi.String("Global Account Viewer"),
//				UserName:           pulumi.String("john.doe@mycompany.com"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = btp.NewGlobalaccountRoleCollectionAssignment(ctx, "globalaccountViewerGroup", &btp.GlobalaccountRoleCollectionAssignmentArgs{
//				GroupName:          pulumi.String("globalaccount-viewer-group"),
//				RoleCollectionName: pulumi.String("Global Account Viewer"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type GlobalaccountRoleCollectionAssignment struct {
	pulumi.CustomResourceState

	// The name of the attribute to assign.
	AttributeName pulumi.StringPtrOutput `pulumi:"attributeName"`
	// The value of the attribute to assign.
	AttributeValue pulumi.StringPtrOutput `pulumi:"attributeValue"`
	// The name of the group to assign.
	GroupName pulumi.StringPtrOutput `pulumi:"groupName"`
	// The identity provider that hosts the user or group. The default value is `ldap`.
	Origin pulumi.StringOutput `pulumi:"origin"`
	// The name of the role collection.
	RoleCollectionName pulumi.StringOutput `pulumi:"roleCollectionName"`
	// The name of the user to assign.
	UserName pulumi.StringPtrOutput `pulumi:"userName"`
}

// NewGlobalaccountRoleCollectionAssignment registers a new resource with the given unique name, arguments, and options.
func NewGlobalaccountRoleCollectionAssignment(ctx *pulumi.Context,
	name string, args *GlobalaccountRoleCollectionAssignmentArgs, opts ...pulumi.ResourceOption) (*GlobalaccountRoleCollectionAssignment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RoleCollectionName == nil {
		return nil, errors.New("invalid value for required argument 'RoleCollectionName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GlobalaccountRoleCollectionAssignment
	err := ctx.RegisterResource("btp:index/globalaccountRoleCollectionAssignment:GlobalaccountRoleCollectionAssignment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGlobalaccountRoleCollectionAssignment gets an existing GlobalaccountRoleCollectionAssignment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGlobalaccountRoleCollectionAssignment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GlobalaccountRoleCollectionAssignmentState, opts ...pulumi.ResourceOption) (*GlobalaccountRoleCollectionAssignment, error) {
	var resource GlobalaccountRoleCollectionAssignment
	err := ctx.ReadResource("btp:index/globalaccountRoleCollectionAssignment:GlobalaccountRoleCollectionAssignment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GlobalaccountRoleCollectionAssignment resources.
type globalaccountRoleCollectionAssignmentState struct {
	// The name of the attribute to assign.
	AttributeName *string `pulumi:"attributeName"`
	// The value of the attribute to assign.
	AttributeValue *string `pulumi:"attributeValue"`
	// The name of the group to assign.
	GroupName *string `pulumi:"groupName"`
	// The identity provider that hosts the user or group. The default value is `ldap`.
	Origin *string `pulumi:"origin"`
	// The name of the role collection.
	RoleCollectionName *string `pulumi:"roleCollectionName"`
	// The name of the user to assign.
	UserName *string `pulumi:"userName"`
}

type GlobalaccountRoleCollectionAssignmentState struct {
	// The name of the attribute to assign.
	AttributeName pulumi.StringPtrInput
	// The value of the attribute to assign.
	AttributeValue pulumi.StringPtrInput
	// The name of the group to assign.
	GroupName pulumi.StringPtrInput
	// The identity provider that hosts the user or group. The default value is `ldap`.
	Origin pulumi.StringPtrInput
	// The name of the role collection.
	RoleCollectionName pulumi.StringPtrInput
	// The name of the user to assign.
	UserName pulumi.StringPtrInput
}

func (GlobalaccountRoleCollectionAssignmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*globalaccountRoleCollectionAssignmentState)(nil)).Elem()
}

type globalaccountRoleCollectionAssignmentArgs struct {
	// The name of the attribute to assign.
	AttributeName *string `pulumi:"attributeName"`
	// The value of the attribute to assign.
	AttributeValue *string `pulumi:"attributeValue"`
	// The name of the group to assign.
	GroupName *string `pulumi:"groupName"`
	// The identity provider that hosts the user or group. The default value is `ldap`.
	Origin *string `pulumi:"origin"`
	// The name of the role collection.
	RoleCollectionName string `pulumi:"roleCollectionName"`
	// The name of the user to assign.
	UserName *string `pulumi:"userName"`
}

// The set of arguments for constructing a GlobalaccountRoleCollectionAssignment resource.
type GlobalaccountRoleCollectionAssignmentArgs struct {
	// The name of the attribute to assign.
	AttributeName pulumi.StringPtrInput
	// The value of the attribute to assign.
	AttributeValue pulumi.StringPtrInput
	// The name of the group to assign.
	GroupName pulumi.StringPtrInput
	// The identity provider that hosts the user or group. The default value is `ldap`.
	Origin pulumi.StringPtrInput
	// The name of the role collection.
	RoleCollectionName pulumi.StringInput
	// The name of the user to assign.
	UserName pulumi.StringPtrInput
}

func (GlobalaccountRoleCollectionAssignmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*globalaccountRoleCollectionAssignmentArgs)(nil)).Elem()
}

type GlobalaccountRoleCollectionAssignmentInput interface {
	pulumi.Input

	ToGlobalaccountRoleCollectionAssignmentOutput() GlobalaccountRoleCollectionAssignmentOutput
	ToGlobalaccountRoleCollectionAssignmentOutputWithContext(ctx context.Context) GlobalaccountRoleCollectionAssignmentOutput
}

func (*GlobalaccountRoleCollectionAssignment) ElementType() reflect.Type {
	return reflect.TypeOf((**GlobalaccountRoleCollectionAssignment)(nil)).Elem()
}

func (i *GlobalaccountRoleCollectionAssignment) ToGlobalaccountRoleCollectionAssignmentOutput() GlobalaccountRoleCollectionAssignmentOutput {
	return i.ToGlobalaccountRoleCollectionAssignmentOutputWithContext(context.Background())
}

func (i *GlobalaccountRoleCollectionAssignment) ToGlobalaccountRoleCollectionAssignmentOutputWithContext(ctx context.Context) GlobalaccountRoleCollectionAssignmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalaccountRoleCollectionAssignmentOutput)
}

func (i *GlobalaccountRoleCollectionAssignment) ToOutput(ctx context.Context) pulumix.Output[*GlobalaccountRoleCollectionAssignment] {
	return pulumix.Output[*GlobalaccountRoleCollectionAssignment]{
		OutputState: i.ToGlobalaccountRoleCollectionAssignmentOutputWithContext(ctx).OutputState,
	}
}

// GlobalaccountRoleCollectionAssignmentArrayInput is an input type that accepts GlobalaccountRoleCollectionAssignmentArray and GlobalaccountRoleCollectionAssignmentArrayOutput values.
// You can construct a concrete instance of `GlobalaccountRoleCollectionAssignmentArrayInput` via:
//
//	GlobalaccountRoleCollectionAssignmentArray{ GlobalaccountRoleCollectionAssignmentArgs{...} }
type GlobalaccountRoleCollectionAssignmentArrayInput interface {
	pulumi.Input

	ToGlobalaccountRoleCollectionAssignmentArrayOutput() GlobalaccountRoleCollectionAssignmentArrayOutput
	ToGlobalaccountRoleCollectionAssignmentArrayOutputWithContext(context.Context) GlobalaccountRoleCollectionAssignmentArrayOutput
}

type GlobalaccountRoleCollectionAssignmentArray []GlobalaccountRoleCollectionAssignmentInput

func (GlobalaccountRoleCollectionAssignmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GlobalaccountRoleCollectionAssignment)(nil)).Elem()
}

func (i GlobalaccountRoleCollectionAssignmentArray) ToGlobalaccountRoleCollectionAssignmentArrayOutput() GlobalaccountRoleCollectionAssignmentArrayOutput {
	return i.ToGlobalaccountRoleCollectionAssignmentArrayOutputWithContext(context.Background())
}

func (i GlobalaccountRoleCollectionAssignmentArray) ToGlobalaccountRoleCollectionAssignmentArrayOutputWithContext(ctx context.Context) GlobalaccountRoleCollectionAssignmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalaccountRoleCollectionAssignmentArrayOutput)
}

func (i GlobalaccountRoleCollectionAssignmentArray) ToOutput(ctx context.Context) pulumix.Output[[]*GlobalaccountRoleCollectionAssignment] {
	return pulumix.Output[[]*GlobalaccountRoleCollectionAssignment]{
		OutputState: i.ToGlobalaccountRoleCollectionAssignmentArrayOutputWithContext(ctx).OutputState,
	}
}

// GlobalaccountRoleCollectionAssignmentMapInput is an input type that accepts GlobalaccountRoleCollectionAssignmentMap and GlobalaccountRoleCollectionAssignmentMapOutput values.
// You can construct a concrete instance of `GlobalaccountRoleCollectionAssignmentMapInput` via:
//
//	GlobalaccountRoleCollectionAssignmentMap{ "key": GlobalaccountRoleCollectionAssignmentArgs{...} }
type GlobalaccountRoleCollectionAssignmentMapInput interface {
	pulumi.Input

	ToGlobalaccountRoleCollectionAssignmentMapOutput() GlobalaccountRoleCollectionAssignmentMapOutput
	ToGlobalaccountRoleCollectionAssignmentMapOutputWithContext(context.Context) GlobalaccountRoleCollectionAssignmentMapOutput
}

type GlobalaccountRoleCollectionAssignmentMap map[string]GlobalaccountRoleCollectionAssignmentInput

func (GlobalaccountRoleCollectionAssignmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GlobalaccountRoleCollectionAssignment)(nil)).Elem()
}

func (i GlobalaccountRoleCollectionAssignmentMap) ToGlobalaccountRoleCollectionAssignmentMapOutput() GlobalaccountRoleCollectionAssignmentMapOutput {
	return i.ToGlobalaccountRoleCollectionAssignmentMapOutputWithContext(context.Background())
}

func (i GlobalaccountRoleCollectionAssignmentMap) ToGlobalaccountRoleCollectionAssignmentMapOutputWithContext(ctx context.Context) GlobalaccountRoleCollectionAssignmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalaccountRoleCollectionAssignmentMapOutput)
}

func (i GlobalaccountRoleCollectionAssignmentMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*GlobalaccountRoleCollectionAssignment] {
	return pulumix.Output[map[string]*GlobalaccountRoleCollectionAssignment]{
		OutputState: i.ToGlobalaccountRoleCollectionAssignmentMapOutputWithContext(ctx).OutputState,
	}
}

type GlobalaccountRoleCollectionAssignmentOutput struct{ *pulumi.OutputState }

func (GlobalaccountRoleCollectionAssignmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GlobalaccountRoleCollectionAssignment)(nil)).Elem()
}

func (o GlobalaccountRoleCollectionAssignmentOutput) ToGlobalaccountRoleCollectionAssignmentOutput() GlobalaccountRoleCollectionAssignmentOutput {
	return o
}

func (o GlobalaccountRoleCollectionAssignmentOutput) ToGlobalaccountRoleCollectionAssignmentOutputWithContext(ctx context.Context) GlobalaccountRoleCollectionAssignmentOutput {
	return o
}

func (o GlobalaccountRoleCollectionAssignmentOutput) ToOutput(ctx context.Context) pulumix.Output[*GlobalaccountRoleCollectionAssignment] {
	return pulumix.Output[*GlobalaccountRoleCollectionAssignment]{
		OutputState: o.OutputState,
	}
}

// The name of the attribute to assign.
func (o GlobalaccountRoleCollectionAssignmentOutput) AttributeName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GlobalaccountRoleCollectionAssignment) pulumi.StringPtrOutput { return v.AttributeName }).(pulumi.StringPtrOutput)
}

// The value of the attribute to assign.
func (o GlobalaccountRoleCollectionAssignmentOutput) AttributeValue() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GlobalaccountRoleCollectionAssignment) pulumi.StringPtrOutput { return v.AttributeValue }).(pulumi.StringPtrOutput)
}

// The name of the group to assign.
func (o GlobalaccountRoleCollectionAssignmentOutput) GroupName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GlobalaccountRoleCollectionAssignment) pulumi.StringPtrOutput { return v.GroupName }).(pulumi.StringPtrOutput)
}

// The identity provider that hosts the user or group. The default value is `ldap`.
func (o GlobalaccountRoleCollectionAssignmentOutput) Origin() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalaccountRoleCollectionAssignment) pulumi.StringOutput { return v.Origin }).(pulumi.StringOutput)
}

// The name of the role collection.
func (o GlobalaccountRoleCollectionAssignmentOutput) RoleCollectionName() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalaccountRoleCollectionAssignment) pulumi.StringOutput { return v.RoleCollectionName }).(pulumi.StringOutput)
}

// The name of the user to assign.
func (o GlobalaccountRoleCollectionAssignmentOutput) UserName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GlobalaccountRoleCollectionAssignment) pulumi.StringPtrOutput { return v.UserName }).(pulumi.StringPtrOutput)
}

type GlobalaccountRoleCollectionAssignmentArrayOutput struct{ *pulumi.OutputState }

func (GlobalaccountRoleCollectionAssignmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GlobalaccountRoleCollectionAssignment)(nil)).Elem()
}

func (o GlobalaccountRoleCollectionAssignmentArrayOutput) ToGlobalaccountRoleCollectionAssignmentArrayOutput() GlobalaccountRoleCollectionAssignmentArrayOutput {
	return o
}

func (o GlobalaccountRoleCollectionAssignmentArrayOutput) ToGlobalaccountRoleCollectionAssignmentArrayOutputWithContext(ctx context.Context) GlobalaccountRoleCollectionAssignmentArrayOutput {
	return o
}

func (o GlobalaccountRoleCollectionAssignmentArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*GlobalaccountRoleCollectionAssignment] {
	return pulumix.Output[[]*GlobalaccountRoleCollectionAssignment]{
		OutputState: o.OutputState,
	}
}

func (o GlobalaccountRoleCollectionAssignmentArrayOutput) Index(i pulumi.IntInput) GlobalaccountRoleCollectionAssignmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GlobalaccountRoleCollectionAssignment {
		return vs[0].([]*GlobalaccountRoleCollectionAssignment)[vs[1].(int)]
	}).(GlobalaccountRoleCollectionAssignmentOutput)
}

type GlobalaccountRoleCollectionAssignmentMapOutput struct{ *pulumi.OutputState }

func (GlobalaccountRoleCollectionAssignmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GlobalaccountRoleCollectionAssignment)(nil)).Elem()
}

func (o GlobalaccountRoleCollectionAssignmentMapOutput) ToGlobalaccountRoleCollectionAssignmentMapOutput() GlobalaccountRoleCollectionAssignmentMapOutput {
	return o
}

func (o GlobalaccountRoleCollectionAssignmentMapOutput) ToGlobalaccountRoleCollectionAssignmentMapOutputWithContext(ctx context.Context) GlobalaccountRoleCollectionAssignmentMapOutput {
	return o
}

func (o GlobalaccountRoleCollectionAssignmentMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*GlobalaccountRoleCollectionAssignment] {
	return pulumix.Output[map[string]*GlobalaccountRoleCollectionAssignment]{
		OutputState: o.OutputState,
	}
}

func (o GlobalaccountRoleCollectionAssignmentMapOutput) MapIndex(k pulumi.StringInput) GlobalaccountRoleCollectionAssignmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GlobalaccountRoleCollectionAssignment {
		return vs[0].(map[string]*GlobalaccountRoleCollectionAssignment)[vs[1].(string)]
	}).(GlobalaccountRoleCollectionAssignmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalaccountRoleCollectionAssignmentInput)(nil)).Elem(), &GlobalaccountRoleCollectionAssignment{})
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalaccountRoleCollectionAssignmentArrayInput)(nil)).Elem(), GlobalaccountRoleCollectionAssignmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalaccountRoleCollectionAssignmentMapInput)(nil)).Elem(), GlobalaccountRoleCollectionAssignmentMap{})
	pulumi.RegisterOutputType(GlobalaccountRoleCollectionAssignmentOutput{})
	pulumi.RegisterOutputType(GlobalaccountRoleCollectionAssignmentArrayOutput{})
	pulumi.RegisterOutputType(GlobalaccountRoleCollectionAssignmentMapOutput{})
}
