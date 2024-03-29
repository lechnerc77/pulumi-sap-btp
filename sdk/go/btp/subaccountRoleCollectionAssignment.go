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

// Assigns a user to a role collection on a subaccount level.
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
//			_, err := btp.NewSubaccountRoleCollectionAssignment(ctx, "jd", &btp.SubaccountRoleCollectionAssignmentArgs{
//				RoleCollectionName: pulumi.String("Subaccount Viewer"),
//				SubaccountId:       pulumi.String("6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f"),
//				UserName:           pulumi.String("john.doe@mycompany.com"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = btp.NewSubaccountRoleCollectionAssignment(ctx, "subaccountViewerGroup", &btp.SubaccountRoleCollectionAssignmentArgs{
//				GroupName:          pulumi.String("subaccount-viewer-group"),
//				RoleCollectionName: pulumi.String("Subaccount Viewer"),
//				SubaccountId:       pulumi.String("6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type SubaccountRoleCollectionAssignment struct {
	pulumi.CustomResourceState

	// The name of the attribute to assign.
	AttributeName pulumi.StringPtrOutput `pulumi:"attributeName"`
	// The value of the attribute to assign.
	AttributeValue pulumi.StringPtrOutput `pulumi:"attributeValue"`
	// The name of the group to assign.
	GroupName pulumi.StringPtrOutput `pulumi:"groupName"`
	// The identity provider that hosts the user or a group. Only needed for custom identity provider.
	Origin pulumi.StringOutput `pulumi:"origin"`
	// The name of the role collection.
	RoleCollectionName pulumi.StringOutput `pulumi:"roleCollectionName"`
	// The ID of the subaccount.
	SubaccountId pulumi.StringOutput `pulumi:"subaccountId"`
	// The username of the user to assign.
	UserName pulumi.StringPtrOutput `pulumi:"userName"`
}

// NewSubaccountRoleCollectionAssignment registers a new resource with the given unique name, arguments, and options.
func NewSubaccountRoleCollectionAssignment(ctx *pulumi.Context,
	name string, args *SubaccountRoleCollectionAssignmentArgs, opts ...pulumi.ResourceOption) (*SubaccountRoleCollectionAssignment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RoleCollectionName == nil {
		return nil, errors.New("invalid value for required argument 'RoleCollectionName'")
	}
	if args.SubaccountId == nil {
		return nil, errors.New("invalid value for required argument 'SubaccountId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SubaccountRoleCollectionAssignment
	err := ctx.RegisterResource("btp:index/subaccountRoleCollectionAssignment:SubaccountRoleCollectionAssignment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSubaccountRoleCollectionAssignment gets an existing SubaccountRoleCollectionAssignment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSubaccountRoleCollectionAssignment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SubaccountRoleCollectionAssignmentState, opts ...pulumi.ResourceOption) (*SubaccountRoleCollectionAssignment, error) {
	var resource SubaccountRoleCollectionAssignment
	err := ctx.ReadResource("btp:index/subaccountRoleCollectionAssignment:SubaccountRoleCollectionAssignment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SubaccountRoleCollectionAssignment resources.
type subaccountRoleCollectionAssignmentState struct {
	// The name of the attribute to assign.
	AttributeName *string `pulumi:"attributeName"`
	// The value of the attribute to assign.
	AttributeValue *string `pulumi:"attributeValue"`
	// The name of the group to assign.
	GroupName *string `pulumi:"groupName"`
	// The identity provider that hosts the user or a group. Only needed for custom identity provider.
	Origin *string `pulumi:"origin"`
	// The name of the role collection.
	RoleCollectionName *string `pulumi:"roleCollectionName"`
	// The ID of the subaccount.
	SubaccountId *string `pulumi:"subaccountId"`
	// The username of the user to assign.
	UserName *string `pulumi:"userName"`
}

type SubaccountRoleCollectionAssignmentState struct {
	// The name of the attribute to assign.
	AttributeName pulumi.StringPtrInput
	// The value of the attribute to assign.
	AttributeValue pulumi.StringPtrInput
	// The name of the group to assign.
	GroupName pulumi.StringPtrInput
	// The identity provider that hosts the user or a group. Only needed for custom identity provider.
	Origin pulumi.StringPtrInput
	// The name of the role collection.
	RoleCollectionName pulumi.StringPtrInput
	// The ID of the subaccount.
	SubaccountId pulumi.StringPtrInput
	// The username of the user to assign.
	UserName pulumi.StringPtrInput
}

func (SubaccountRoleCollectionAssignmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*subaccountRoleCollectionAssignmentState)(nil)).Elem()
}

type subaccountRoleCollectionAssignmentArgs struct {
	// The name of the attribute to assign.
	AttributeName *string `pulumi:"attributeName"`
	// The value of the attribute to assign.
	AttributeValue *string `pulumi:"attributeValue"`
	// The name of the group to assign.
	GroupName *string `pulumi:"groupName"`
	// The identity provider that hosts the user or a group. Only needed for custom identity provider.
	Origin *string `pulumi:"origin"`
	// The name of the role collection.
	RoleCollectionName string `pulumi:"roleCollectionName"`
	// The ID of the subaccount.
	SubaccountId string `pulumi:"subaccountId"`
	// The username of the user to assign.
	UserName *string `pulumi:"userName"`
}

// The set of arguments for constructing a SubaccountRoleCollectionAssignment resource.
type SubaccountRoleCollectionAssignmentArgs struct {
	// The name of the attribute to assign.
	AttributeName pulumi.StringPtrInput
	// The value of the attribute to assign.
	AttributeValue pulumi.StringPtrInput
	// The name of the group to assign.
	GroupName pulumi.StringPtrInput
	// The identity provider that hosts the user or a group. Only needed for custom identity provider.
	Origin pulumi.StringPtrInput
	// The name of the role collection.
	RoleCollectionName pulumi.StringInput
	// The ID of the subaccount.
	SubaccountId pulumi.StringInput
	// The username of the user to assign.
	UserName pulumi.StringPtrInput
}

func (SubaccountRoleCollectionAssignmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*subaccountRoleCollectionAssignmentArgs)(nil)).Elem()
}

type SubaccountRoleCollectionAssignmentInput interface {
	pulumi.Input

	ToSubaccountRoleCollectionAssignmentOutput() SubaccountRoleCollectionAssignmentOutput
	ToSubaccountRoleCollectionAssignmentOutputWithContext(ctx context.Context) SubaccountRoleCollectionAssignmentOutput
}

func (*SubaccountRoleCollectionAssignment) ElementType() reflect.Type {
	return reflect.TypeOf((**SubaccountRoleCollectionAssignment)(nil)).Elem()
}

func (i *SubaccountRoleCollectionAssignment) ToSubaccountRoleCollectionAssignmentOutput() SubaccountRoleCollectionAssignmentOutput {
	return i.ToSubaccountRoleCollectionAssignmentOutputWithContext(context.Background())
}

func (i *SubaccountRoleCollectionAssignment) ToSubaccountRoleCollectionAssignmentOutputWithContext(ctx context.Context) SubaccountRoleCollectionAssignmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubaccountRoleCollectionAssignmentOutput)
}

func (i *SubaccountRoleCollectionAssignment) ToOutput(ctx context.Context) pulumix.Output[*SubaccountRoleCollectionAssignment] {
	return pulumix.Output[*SubaccountRoleCollectionAssignment]{
		OutputState: i.ToSubaccountRoleCollectionAssignmentOutputWithContext(ctx).OutputState,
	}
}

// SubaccountRoleCollectionAssignmentArrayInput is an input type that accepts SubaccountRoleCollectionAssignmentArray and SubaccountRoleCollectionAssignmentArrayOutput values.
// You can construct a concrete instance of `SubaccountRoleCollectionAssignmentArrayInput` via:
//
//	SubaccountRoleCollectionAssignmentArray{ SubaccountRoleCollectionAssignmentArgs{...} }
type SubaccountRoleCollectionAssignmentArrayInput interface {
	pulumi.Input

	ToSubaccountRoleCollectionAssignmentArrayOutput() SubaccountRoleCollectionAssignmentArrayOutput
	ToSubaccountRoleCollectionAssignmentArrayOutputWithContext(context.Context) SubaccountRoleCollectionAssignmentArrayOutput
}

type SubaccountRoleCollectionAssignmentArray []SubaccountRoleCollectionAssignmentInput

func (SubaccountRoleCollectionAssignmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SubaccountRoleCollectionAssignment)(nil)).Elem()
}

func (i SubaccountRoleCollectionAssignmentArray) ToSubaccountRoleCollectionAssignmentArrayOutput() SubaccountRoleCollectionAssignmentArrayOutput {
	return i.ToSubaccountRoleCollectionAssignmentArrayOutputWithContext(context.Background())
}

func (i SubaccountRoleCollectionAssignmentArray) ToSubaccountRoleCollectionAssignmentArrayOutputWithContext(ctx context.Context) SubaccountRoleCollectionAssignmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubaccountRoleCollectionAssignmentArrayOutput)
}

func (i SubaccountRoleCollectionAssignmentArray) ToOutput(ctx context.Context) pulumix.Output[[]*SubaccountRoleCollectionAssignment] {
	return pulumix.Output[[]*SubaccountRoleCollectionAssignment]{
		OutputState: i.ToSubaccountRoleCollectionAssignmentArrayOutputWithContext(ctx).OutputState,
	}
}

// SubaccountRoleCollectionAssignmentMapInput is an input type that accepts SubaccountRoleCollectionAssignmentMap and SubaccountRoleCollectionAssignmentMapOutput values.
// You can construct a concrete instance of `SubaccountRoleCollectionAssignmentMapInput` via:
//
//	SubaccountRoleCollectionAssignmentMap{ "key": SubaccountRoleCollectionAssignmentArgs{...} }
type SubaccountRoleCollectionAssignmentMapInput interface {
	pulumi.Input

	ToSubaccountRoleCollectionAssignmentMapOutput() SubaccountRoleCollectionAssignmentMapOutput
	ToSubaccountRoleCollectionAssignmentMapOutputWithContext(context.Context) SubaccountRoleCollectionAssignmentMapOutput
}

type SubaccountRoleCollectionAssignmentMap map[string]SubaccountRoleCollectionAssignmentInput

func (SubaccountRoleCollectionAssignmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SubaccountRoleCollectionAssignment)(nil)).Elem()
}

func (i SubaccountRoleCollectionAssignmentMap) ToSubaccountRoleCollectionAssignmentMapOutput() SubaccountRoleCollectionAssignmentMapOutput {
	return i.ToSubaccountRoleCollectionAssignmentMapOutputWithContext(context.Background())
}

func (i SubaccountRoleCollectionAssignmentMap) ToSubaccountRoleCollectionAssignmentMapOutputWithContext(ctx context.Context) SubaccountRoleCollectionAssignmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubaccountRoleCollectionAssignmentMapOutput)
}

func (i SubaccountRoleCollectionAssignmentMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*SubaccountRoleCollectionAssignment] {
	return pulumix.Output[map[string]*SubaccountRoleCollectionAssignment]{
		OutputState: i.ToSubaccountRoleCollectionAssignmentMapOutputWithContext(ctx).OutputState,
	}
}

type SubaccountRoleCollectionAssignmentOutput struct{ *pulumi.OutputState }

func (SubaccountRoleCollectionAssignmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SubaccountRoleCollectionAssignment)(nil)).Elem()
}

func (o SubaccountRoleCollectionAssignmentOutput) ToSubaccountRoleCollectionAssignmentOutput() SubaccountRoleCollectionAssignmentOutput {
	return o
}

func (o SubaccountRoleCollectionAssignmentOutput) ToSubaccountRoleCollectionAssignmentOutputWithContext(ctx context.Context) SubaccountRoleCollectionAssignmentOutput {
	return o
}

func (o SubaccountRoleCollectionAssignmentOutput) ToOutput(ctx context.Context) pulumix.Output[*SubaccountRoleCollectionAssignment] {
	return pulumix.Output[*SubaccountRoleCollectionAssignment]{
		OutputState: o.OutputState,
	}
}

// The name of the attribute to assign.
func (o SubaccountRoleCollectionAssignmentOutput) AttributeName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SubaccountRoleCollectionAssignment) pulumi.StringPtrOutput { return v.AttributeName }).(pulumi.StringPtrOutput)
}

// The value of the attribute to assign.
func (o SubaccountRoleCollectionAssignmentOutput) AttributeValue() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SubaccountRoleCollectionAssignment) pulumi.StringPtrOutput { return v.AttributeValue }).(pulumi.StringPtrOutput)
}

// The name of the group to assign.
func (o SubaccountRoleCollectionAssignmentOutput) GroupName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SubaccountRoleCollectionAssignment) pulumi.StringPtrOutput { return v.GroupName }).(pulumi.StringPtrOutput)
}

// The identity provider that hosts the user or a group. Only needed for custom identity provider.
func (o SubaccountRoleCollectionAssignmentOutput) Origin() pulumi.StringOutput {
	return o.ApplyT(func(v *SubaccountRoleCollectionAssignment) pulumi.StringOutput { return v.Origin }).(pulumi.StringOutput)
}

// The name of the role collection.
func (o SubaccountRoleCollectionAssignmentOutput) RoleCollectionName() pulumi.StringOutput {
	return o.ApplyT(func(v *SubaccountRoleCollectionAssignment) pulumi.StringOutput { return v.RoleCollectionName }).(pulumi.StringOutput)
}

// The ID of the subaccount.
func (o SubaccountRoleCollectionAssignmentOutput) SubaccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *SubaccountRoleCollectionAssignment) pulumi.StringOutput { return v.SubaccountId }).(pulumi.StringOutput)
}

// The username of the user to assign.
func (o SubaccountRoleCollectionAssignmentOutput) UserName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SubaccountRoleCollectionAssignment) pulumi.StringPtrOutput { return v.UserName }).(pulumi.StringPtrOutput)
}

type SubaccountRoleCollectionAssignmentArrayOutput struct{ *pulumi.OutputState }

func (SubaccountRoleCollectionAssignmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SubaccountRoleCollectionAssignment)(nil)).Elem()
}

func (o SubaccountRoleCollectionAssignmentArrayOutput) ToSubaccountRoleCollectionAssignmentArrayOutput() SubaccountRoleCollectionAssignmentArrayOutput {
	return o
}

func (o SubaccountRoleCollectionAssignmentArrayOutput) ToSubaccountRoleCollectionAssignmentArrayOutputWithContext(ctx context.Context) SubaccountRoleCollectionAssignmentArrayOutput {
	return o
}

func (o SubaccountRoleCollectionAssignmentArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*SubaccountRoleCollectionAssignment] {
	return pulumix.Output[[]*SubaccountRoleCollectionAssignment]{
		OutputState: o.OutputState,
	}
}

func (o SubaccountRoleCollectionAssignmentArrayOutput) Index(i pulumi.IntInput) SubaccountRoleCollectionAssignmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SubaccountRoleCollectionAssignment {
		return vs[0].([]*SubaccountRoleCollectionAssignment)[vs[1].(int)]
	}).(SubaccountRoleCollectionAssignmentOutput)
}

type SubaccountRoleCollectionAssignmentMapOutput struct{ *pulumi.OutputState }

func (SubaccountRoleCollectionAssignmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SubaccountRoleCollectionAssignment)(nil)).Elem()
}

func (o SubaccountRoleCollectionAssignmentMapOutput) ToSubaccountRoleCollectionAssignmentMapOutput() SubaccountRoleCollectionAssignmentMapOutput {
	return o
}

func (o SubaccountRoleCollectionAssignmentMapOutput) ToSubaccountRoleCollectionAssignmentMapOutputWithContext(ctx context.Context) SubaccountRoleCollectionAssignmentMapOutput {
	return o
}

func (o SubaccountRoleCollectionAssignmentMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*SubaccountRoleCollectionAssignment] {
	return pulumix.Output[map[string]*SubaccountRoleCollectionAssignment]{
		OutputState: o.OutputState,
	}
}

func (o SubaccountRoleCollectionAssignmentMapOutput) MapIndex(k pulumi.StringInput) SubaccountRoleCollectionAssignmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SubaccountRoleCollectionAssignment {
		return vs[0].(map[string]*SubaccountRoleCollectionAssignment)[vs[1].(string)]
	}).(SubaccountRoleCollectionAssignmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SubaccountRoleCollectionAssignmentInput)(nil)).Elem(), &SubaccountRoleCollectionAssignment{})
	pulumi.RegisterInputType(reflect.TypeOf((*SubaccountRoleCollectionAssignmentArrayInput)(nil)).Elem(), SubaccountRoleCollectionAssignmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SubaccountRoleCollectionAssignmentMapInput)(nil)).Elem(), SubaccountRoleCollectionAssignmentMap{})
	pulumi.RegisterOutputType(SubaccountRoleCollectionAssignmentOutput{})
	pulumi.RegisterOutputType(SubaccountRoleCollectionAssignmentArrayOutput{})
	pulumi.RegisterOutputType(SubaccountRoleCollectionAssignmentMapOutput{})
}
