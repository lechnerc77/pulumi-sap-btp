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

// Assigns a user to a role collection on a directory level.
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
//			_, err := btp.NewDirectoryRoleCollectionAssignment(ctx, "jd", &btp.DirectoryRoleCollectionAssignmentArgs{
//				DirectoryId:        pulumi.String("ddfc2206-5f11-48ed-a1ec-29010af70050"),
//				RoleCollectionName: pulumi.String("Directory Viewer"),
//				UserName:           pulumi.String("john.doe@mycompany.com"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = btp.NewDirectoryRoleCollectionAssignment(ctx, "directoryViewerGroup", &btp.DirectoryRoleCollectionAssignmentArgs{
//				DirectoryId:        pulumi.String("ddfc2206-5f11-48ed-a1ec-29010af70050"),
//				GroupName:          pulumi.String("directory-viewer-group"),
//				RoleCollectionName: pulumi.String("Directory Viewer"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type DirectoryRoleCollectionAssignment struct {
	pulumi.CustomResourceState

	// The name of the attribute to assign.
	AttributeName pulumi.StringPtrOutput `pulumi:"attributeName"`
	// The value of the attribute to assign.
	AttributeValue pulumi.StringPtrOutput `pulumi:"attributeValue"`
	// The ID of the directory.
	DirectoryId pulumi.StringOutput `pulumi:"directoryId"`
	// The name of the group to assign.
	GroupName pulumi.StringPtrOutput `pulumi:"groupName"`
	// The identity provider that hosts the user or a group. Only needed for custom identity provider.
	Origin pulumi.StringOutput `pulumi:"origin"`
	// The name of the role collection.
	RoleCollectionName pulumi.StringOutput `pulumi:"roleCollectionName"`
	// The username of the user to assign.
	UserName pulumi.StringPtrOutput `pulumi:"userName"`
}

// NewDirectoryRoleCollectionAssignment registers a new resource with the given unique name, arguments, and options.
func NewDirectoryRoleCollectionAssignment(ctx *pulumi.Context,
	name string, args *DirectoryRoleCollectionAssignmentArgs, opts ...pulumi.ResourceOption) (*DirectoryRoleCollectionAssignment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DirectoryId == nil {
		return nil, errors.New("invalid value for required argument 'DirectoryId'")
	}
	if args.RoleCollectionName == nil {
		return nil, errors.New("invalid value for required argument 'RoleCollectionName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DirectoryRoleCollectionAssignment
	err := ctx.RegisterResource("btp:index/directoryRoleCollectionAssignment:DirectoryRoleCollectionAssignment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDirectoryRoleCollectionAssignment gets an existing DirectoryRoleCollectionAssignment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDirectoryRoleCollectionAssignment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DirectoryRoleCollectionAssignmentState, opts ...pulumi.ResourceOption) (*DirectoryRoleCollectionAssignment, error) {
	var resource DirectoryRoleCollectionAssignment
	err := ctx.ReadResource("btp:index/directoryRoleCollectionAssignment:DirectoryRoleCollectionAssignment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DirectoryRoleCollectionAssignment resources.
type directoryRoleCollectionAssignmentState struct {
	// The name of the attribute to assign.
	AttributeName *string `pulumi:"attributeName"`
	// The value of the attribute to assign.
	AttributeValue *string `pulumi:"attributeValue"`
	// The ID of the directory.
	DirectoryId *string `pulumi:"directoryId"`
	// The name of the group to assign.
	GroupName *string `pulumi:"groupName"`
	// The identity provider that hosts the user or a group. Only needed for custom identity provider.
	Origin *string `pulumi:"origin"`
	// The name of the role collection.
	RoleCollectionName *string `pulumi:"roleCollectionName"`
	// The username of the user to assign.
	UserName *string `pulumi:"userName"`
}

type DirectoryRoleCollectionAssignmentState struct {
	// The name of the attribute to assign.
	AttributeName pulumi.StringPtrInput
	// The value of the attribute to assign.
	AttributeValue pulumi.StringPtrInput
	// The ID of the directory.
	DirectoryId pulumi.StringPtrInput
	// The name of the group to assign.
	GroupName pulumi.StringPtrInput
	// The identity provider that hosts the user or a group. Only needed for custom identity provider.
	Origin pulumi.StringPtrInput
	// The name of the role collection.
	RoleCollectionName pulumi.StringPtrInput
	// The username of the user to assign.
	UserName pulumi.StringPtrInput
}

func (DirectoryRoleCollectionAssignmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*directoryRoleCollectionAssignmentState)(nil)).Elem()
}

type directoryRoleCollectionAssignmentArgs struct {
	// The name of the attribute to assign.
	AttributeName *string `pulumi:"attributeName"`
	// The value of the attribute to assign.
	AttributeValue *string `pulumi:"attributeValue"`
	// The ID of the directory.
	DirectoryId string `pulumi:"directoryId"`
	// The name of the group to assign.
	GroupName *string `pulumi:"groupName"`
	// The identity provider that hosts the user or a group. Only needed for custom identity provider.
	Origin *string `pulumi:"origin"`
	// The name of the role collection.
	RoleCollectionName string `pulumi:"roleCollectionName"`
	// The username of the user to assign.
	UserName *string `pulumi:"userName"`
}

// The set of arguments for constructing a DirectoryRoleCollectionAssignment resource.
type DirectoryRoleCollectionAssignmentArgs struct {
	// The name of the attribute to assign.
	AttributeName pulumi.StringPtrInput
	// The value of the attribute to assign.
	AttributeValue pulumi.StringPtrInput
	// The ID of the directory.
	DirectoryId pulumi.StringInput
	// The name of the group to assign.
	GroupName pulumi.StringPtrInput
	// The identity provider that hosts the user or a group. Only needed for custom identity provider.
	Origin pulumi.StringPtrInput
	// The name of the role collection.
	RoleCollectionName pulumi.StringInput
	// The username of the user to assign.
	UserName pulumi.StringPtrInput
}

func (DirectoryRoleCollectionAssignmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*directoryRoleCollectionAssignmentArgs)(nil)).Elem()
}

type DirectoryRoleCollectionAssignmentInput interface {
	pulumi.Input

	ToDirectoryRoleCollectionAssignmentOutput() DirectoryRoleCollectionAssignmentOutput
	ToDirectoryRoleCollectionAssignmentOutputWithContext(ctx context.Context) DirectoryRoleCollectionAssignmentOutput
}

func (*DirectoryRoleCollectionAssignment) ElementType() reflect.Type {
	return reflect.TypeOf((**DirectoryRoleCollectionAssignment)(nil)).Elem()
}

func (i *DirectoryRoleCollectionAssignment) ToDirectoryRoleCollectionAssignmentOutput() DirectoryRoleCollectionAssignmentOutput {
	return i.ToDirectoryRoleCollectionAssignmentOutputWithContext(context.Background())
}

func (i *DirectoryRoleCollectionAssignment) ToDirectoryRoleCollectionAssignmentOutputWithContext(ctx context.Context) DirectoryRoleCollectionAssignmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DirectoryRoleCollectionAssignmentOutput)
}

func (i *DirectoryRoleCollectionAssignment) ToOutput(ctx context.Context) pulumix.Output[*DirectoryRoleCollectionAssignment] {
	return pulumix.Output[*DirectoryRoleCollectionAssignment]{
		OutputState: i.ToDirectoryRoleCollectionAssignmentOutputWithContext(ctx).OutputState,
	}
}

// DirectoryRoleCollectionAssignmentArrayInput is an input type that accepts DirectoryRoleCollectionAssignmentArray and DirectoryRoleCollectionAssignmentArrayOutput values.
// You can construct a concrete instance of `DirectoryRoleCollectionAssignmentArrayInput` via:
//
//	DirectoryRoleCollectionAssignmentArray{ DirectoryRoleCollectionAssignmentArgs{...} }
type DirectoryRoleCollectionAssignmentArrayInput interface {
	pulumi.Input

	ToDirectoryRoleCollectionAssignmentArrayOutput() DirectoryRoleCollectionAssignmentArrayOutput
	ToDirectoryRoleCollectionAssignmentArrayOutputWithContext(context.Context) DirectoryRoleCollectionAssignmentArrayOutput
}

type DirectoryRoleCollectionAssignmentArray []DirectoryRoleCollectionAssignmentInput

func (DirectoryRoleCollectionAssignmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DirectoryRoleCollectionAssignment)(nil)).Elem()
}

func (i DirectoryRoleCollectionAssignmentArray) ToDirectoryRoleCollectionAssignmentArrayOutput() DirectoryRoleCollectionAssignmentArrayOutput {
	return i.ToDirectoryRoleCollectionAssignmentArrayOutputWithContext(context.Background())
}

func (i DirectoryRoleCollectionAssignmentArray) ToDirectoryRoleCollectionAssignmentArrayOutputWithContext(ctx context.Context) DirectoryRoleCollectionAssignmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DirectoryRoleCollectionAssignmentArrayOutput)
}

func (i DirectoryRoleCollectionAssignmentArray) ToOutput(ctx context.Context) pulumix.Output[[]*DirectoryRoleCollectionAssignment] {
	return pulumix.Output[[]*DirectoryRoleCollectionAssignment]{
		OutputState: i.ToDirectoryRoleCollectionAssignmentArrayOutputWithContext(ctx).OutputState,
	}
}

// DirectoryRoleCollectionAssignmentMapInput is an input type that accepts DirectoryRoleCollectionAssignmentMap and DirectoryRoleCollectionAssignmentMapOutput values.
// You can construct a concrete instance of `DirectoryRoleCollectionAssignmentMapInput` via:
//
//	DirectoryRoleCollectionAssignmentMap{ "key": DirectoryRoleCollectionAssignmentArgs{...} }
type DirectoryRoleCollectionAssignmentMapInput interface {
	pulumi.Input

	ToDirectoryRoleCollectionAssignmentMapOutput() DirectoryRoleCollectionAssignmentMapOutput
	ToDirectoryRoleCollectionAssignmentMapOutputWithContext(context.Context) DirectoryRoleCollectionAssignmentMapOutput
}

type DirectoryRoleCollectionAssignmentMap map[string]DirectoryRoleCollectionAssignmentInput

func (DirectoryRoleCollectionAssignmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DirectoryRoleCollectionAssignment)(nil)).Elem()
}

func (i DirectoryRoleCollectionAssignmentMap) ToDirectoryRoleCollectionAssignmentMapOutput() DirectoryRoleCollectionAssignmentMapOutput {
	return i.ToDirectoryRoleCollectionAssignmentMapOutputWithContext(context.Background())
}

func (i DirectoryRoleCollectionAssignmentMap) ToDirectoryRoleCollectionAssignmentMapOutputWithContext(ctx context.Context) DirectoryRoleCollectionAssignmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DirectoryRoleCollectionAssignmentMapOutput)
}

func (i DirectoryRoleCollectionAssignmentMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*DirectoryRoleCollectionAssignment] {
	return pulumix.Output[map[string]*DirectoryRoleCollectionAssignment]{
		OutputState: i.ToDirectoryRoleCollectionAssignmentMapOutputWithContext(ctx).OutputState,
	}
}

type DirectoryRoleCollectionAssignmentOutput struct{ *pulumi.OutputState }

func (DirectoryRoleCollectionAssignmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DirectoryRoleCollectionAssignment)(nil)).Elem()
}

func (o DirectoryRoleCollectionAssignmentOutput) ToDirectoryRoleCollectionAssignmentOutput() DirectoryRoleCollectionAssignmentOutput {
	return o
}

func (o DirectoryRoleCollectionAssignmentOutput) ToDirectoryRoleCollectionAssignmentOutputWithContext(ctx context.Context) DirectoryRoleCollectionAssignmentOutput {
	return o
}

func (o DirectoryRoleCollectionAssignmentOutput) ToOutput(ctx context.Context) pulumix.Output[*DirectoryRoleCollectionAssignment] {
	return pulumix.Output[*DirectoryRoleCollectionAssignment]{
		OutputState: o.OutputState,
	}
}

// The name of the attribute to assign.
func (o DirectoryRoleCollectionAssignmentOutput) AttributeName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DirectoryRoleCollectionAssignment) pulumi.StringPtrOutput { return v.AttributeName }).(pulumi.StringPtrOutput)
}

// The value of the attribute to assign.
func (o DirectoryRoleCollectionAssignmentOutput) AttributeValue() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DirectoryRoleCollectionAssignment) pulumi.StringPtrOutput { return v.AttributeValue }).(pulumi.StringPtrOutput)
}

// The ID of the directory.
func (o DirectoryRoleCollectionAssignmentOutput) DirectoryId() pulumi.StringOutput {
	return o.ApplyT(func(v *DirectoryRoleCollectionAssignment) pulumi.StringOutput { return v.DirectoryId }).(pulumi.StringOutput)
}

// The name of the group to assign.
func (o DirectoryRoleCollectionAssignmentOutput) GroupName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DirectoryRoleCollectionAssignment) pulumi.StringPtrOutput { return v.GroupName }).(pulumi.StringPtrOutput)
}

// The identity provider that hosts the user or a group. Only needed for custom identity provider.
func (o DirectoryRoleCollectionAssignmentOutput) Origin() pulumi.StringOutput {
	return o.ApplyT(func(v *DirectoryRoleCollectionAssignment) pulumi.StringOutput { return v.Origin }).(pulumi.StringOutput)
}

// The name of the role collection.
func (o DirectoryRoleCollectionAssignmentOutput) RoleCollectionName() pulumi.StringOutput {
	return o.ApplyT(func(v *DirectoryRoleCollectionAssignment) pulumi.StringOutput { return v.RoleCollectionName }).(pulumi.StringOutput)
}

// The username of the user to assign.
func (o DirectoryRoleCollectionAssignmentOutput) UserName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DirectoryRoleCollectionAssignment) pulumi.StringPtrOutput { return v.UserName }).(pulumi.StringPtrOutput)
}

type DirectoryRoleCollectionAssignmentArrayOutput struct{ *pulumi.OutputState }

func (DirectoryRoleCollectionAssignmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DirectoryRoleCollectionAssignment)(nil)).Elem()
}

func (o DirectoryRoleCollectionAssignmentArrayOutput) ToDirectoryRoleCollectionAssignmentArrayOutput() DirectoryRoleCollectionAssignmentArrayOutput {
	return o
}

func (o DirectoryRoleCollectionAssignmentArrayOutput) ToDirectoryRoleCollectionAssignmentArrayOutputWithContext(ctx context.Context) DirectoryRoleCollectionAssignmentArrayOutput {
	return o
}

func (o DirectoryRoleCollectionAssignmentArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*DirectoryRoleCollectionAssignment] {
	return pulumix.Output[[]*DirectoryRoleCollectionAssignment]{
		OutputState: o.OutputState,
	}
}

func (o DirectoryRoleCollectionAssignmentArrayOutput) Index(i pulumi.IntInput) DirectoryRoleCollectionAssignmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DirectoryRoleCollectionAssignment {
		return vs[0].([]*DirectoryRoleCollectionAssignment)[vs[1].(int)]
	}).(DirectoryRoleCollectionAssignmentOutput)
}

type DirectoryRoleCollectionAssignmentMapOutput struct{ *pulumi.OutputState }

func (DirectoryRoleCollectionAssignmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DirectoryRoleCollectionAssignment)(nil)).Elem()
}

func (o DirectoryRoleCollectionAssignmentMapOutput) ToDirectoryRoleCollectionAssignmentMapOutput() DirectoryRoleCollectionAssignmentMapOutput {
	return o
}

func (o DirectoryRoleCollectionAssignmentMapOutput) ToDirectoryRoleCollectionAssignmentMapOutputWithContext(ctx context.Context) DirectoryRoleCollectionAssignmentMapOutput {
	return o
}

func (o DirectoryRoleCollectionAssignmentMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*DirectoryRoleCollectionAssignment] {
	return pulumix.Output[map[string]*DirectoryRoleCollectionAssignment]{
		OutputState: o.OutputState,
	}
}

func (o DirectoryRoleCollectionAssignmentMapOutput) MapIndex(k pulumi.StringInput) DirectoryRoleCollectionAssignmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DirectoryRoleCollectionAssignment {
		return vs[0].(map[string]*DirectoryRoleCollectionAssignment)[vs[1].(string)]
	}).(DirectoryRoleCollectionAssignmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DirectoryRoleCollectionAssignmentInput)(nil)).Elem(), &DirectoryRoleCollectionAssignment{})
	pulumi.RegisterInputType(reflect.TypeOf((*DirectoryRoleCollectionAssignmentArrayInput)(nil)).Elem(), DirectoryRoleCollectionAssignmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DirectoryRoleCollectionAssignmentMapInput)(nil)).Elem(), DirectoryRoleCollectionAssignmentMap{})
	pulumi.RegisterOutputType(DirectoryRoleCollectionAssignmentOutput{})
	pulumi.RegisterOutputType(DirectoryRoleCollectionAssignmentArrayOutput{})
	pulumi.RegisterOutputType(DirectoryRoleCollectionAssignmentMapOutput{})
}
