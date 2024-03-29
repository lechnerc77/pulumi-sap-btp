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

// Creates a service binding, i.e. generates access details to consume a service.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/lechnerc77/pulumi-btp/sdk/go/btp"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := btp.NewSubaccountServiceBinding(ctx, "myBinding", &btp.SubaccountServiceBindingArgs{
//				SubaccountId:      pulumi.String("6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f"),
//				ServiceInstanceId: pulumi.String("8911491d-0e1d-425d-a233-785512602d6f"),
//			})
//			if err != nil {
//				return err
//			}
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"param_a": "",
//				"param_b": "",
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = btp.NewSubaccountServiceBinding(ctx, "myParameterizedBinding", &btp.SubaccountServiceBindingArgs{
//				SubaccountId:      pulumi.String("6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f"),
//				ServiceInstanceId: pulumi.String("8911491d-0e1d-425d-a233-785512602d6f"),
//				Parameters:        pulumi.String(json0),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// terraform
//
// ```sh
//
//	$ pulumi import btp:index/subaccountServiceBinding:SubaccountServiceBinding <resource_name> <subaccount_id>,<service_binding_id>
//
// ```
//
// ```sh
//
//	$ pulumi import btp:index/subaccountServiceBinding:SubaccountServiceBinding my_binding 6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f,910e9a7d-0fb4-4428-a813-56550e683579
//
// ```
type SubaccountServiceBinding struct {
	pulumi.CustomResourceState

	// Contains the resources associated with the binding.
	BindResource pulumi.StringMapOutput `pulumi:"bindResource"`
	// The contextual data for the resource.
	Context pulumi.StringOutput `pulumi:"context"`
	// The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
	CreatedDate pulumi.StringOutput `pulumi:"createdDate"`
	// The credentials to access the binding.
	Credentials pulumi.StringOutput `pulumi:"credentials"`
	// The set of words or phrases assigned to the service binding.
	Labels pulumi.StringArrayMapOutput `pulumi:"labels"`
	// The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
	LastModified pulumi.StringOutput `pulumi:"lastModified"`
	// The name of the service binding.
	Name pulumi.StringOutput `pulumi:"name"`
	// The parameters of the service binding as a valid JSON object.
	Parameters pulumi.StringOutput `pulumi:"parameters"`
	// Shows whether the service binding is ready.
	Ready pulumi.BoolOutput `pulumi:"ready"`
	// The ID of the service instance associated with the binding.
	ServiceInstanceId pulumi.StringOutput `pulumi:"serviceInstanceId"`
	// The current state of the service binding. Possible values are:
	State pulumi.StringOutput `pulumi:"state"`
	// The ID of the subaccount.
	SubaccountId pulumi.StringOutput `pulumi:"subaccountId"`
}

// NewSubaccountServiceBinding registers a new resource with the given unique name, arguments, and options.
func NewSubaccountServiceBinding(ctx *pulumi.Context,
	name string, args *SubaccountServiceBindingArgs, opts ...pulumi.ResourceOption) (*SubaccountServiceBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ServiceInstanceId == nil {
		return nil, errors.New("invalid value for required argument 'ServiceInstanceId'")
	}
	if args.SubaccountId == nil {
		return nil, errors.New("invalid value for required argument 'SubaccountId'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"credentials",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SubaccountServiceBinding
	err := ctx.RegisterResource("btp:index/subaccountServiceBinding:SubaccountServiceBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSubaccountServiceBinding gets an existing SubaccountServiceBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSubaccountServiceBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SubaccountServiceBindingState, opts ...pulumi.ResourceOption) (*SubaccountServiceBinding, error) {
	var resource SubaccountServiceBinding
	err := ctx.ReadResource("btp:index/subaccountServiceBinding:SubaccountServiceBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SubaccountServiceBinding resources.
type subaccountServiceBindingState struct {
	// Contains the resources associated with the binding.
	BindResource map[string]string `pulumi:"bindResource"`
	// The contextual data for the resource.
	Context *string `pulumi:"context"`
	// The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
	CreatedDate *string `pulumi:"createdDate"`
	// The credentials to access the binding.
	Credentials *string `pulumi:"credentials"`
	// The set of words or phrases assigned to the service binding.
	Labels map[string][]string `pulumi:"labels"`
	// The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
	LastModified *string `pulumi:"lastModified"`
	// The name of the service binding.
	Name *string `pulumi:"name"`
	// The parameters of the service binding as a valid JSON object.
	Parameters *string `pulumi:"parameters"`
	// Shows whether the service binding is ready.
	Ready *bool `pulumi:"ready"`
	// The ID of the service instance associated with the binding.
	ServiceInstanceId *string `pulumi:"serviceInstanceId"`
	// The current state of the service binding. Possible values are:
	State *string `pulumi:"state"`
	// The ID of the subaccount.
	SubaccountId *string `pulumi:"subaccountId"`
}

type SubaccountServiceBindingState struct {
	// Contains the resources associated with the binding.
	BindResource pulumi.StringMapInput
	// The contextual data for the resource.
	Context pulumi.StringPtrInput
	// The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
	CreatedDate pulumi.StringPtrInput
	// The credentials to access the binding.
	Credentials pulumi.StringPtrInput
	// The set of words or phrases assigned to the service binding.
	Labels pulumi.StringArrayMapInput
	// The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
	LastModified pulumi.StringPtrInput
	// The name of the service binding.
	Name pulumi.StringPtrInput
	// The parameters of the service binding as a valid JSON object.
	Parameters pulumi.StringPtrInput
	// Shows whether the service binding is ready.
	Ready pulumi.BoolPtrInput
	// The ID of the service instance associated with the binding.
	ServiceInstanceId pulumi.StringPtrInput
	// The current state of the service binding. Possible values are:
	State pulumi.StringPtrInput
	// The ID of the subaccount.
	SubaccountId pulumi.StringPtrInput
}

func (SubaccountServiceBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*subaccountServiceBindingState)(nil)).Elem()
}

type subaccountServiceBindingArgs struct {
	// The set of words or phrases assigned to the service binding.
	Labels map[string][]string `pulumi:"labels"`
	// The name of the service binding.
	Name *string `pulumi:"name"`
	// The parameters of the service binding as a valid JSON object.
	Parameters *string `pulumi:"parameters"`
	// The ID of the service instance associated with the binding.
	ServiceInstanceId string `pulumi:"serviceInstanceId"`
	// The ID of the subaccount.
	SubaccountId string `pulumi:"subaccountId"`
}

// The set of arguments for constructing a SubaccountServiceBinding resource.
type SubaccountServiceBindingArgs struct {
	// The set of words or phrases assigned to the service binding.
	Labels pulumi.StringArrayMapInput
	// The name of the service binding.
	Name pulumi.StringPtrInput
	// The parameters of the service binding as a valid JSON object.
	Parameters pulumi.StringPtrInput
	// The ID of the service instance associated with the binding.
	ServiceInstanceId pulumi.StringInput
	// The ID of the subaccount.
	SubaccountId pulumi.StringInput
}

func (SubaccountServiceBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*subaccountServiceBindingArgs)(nil)).Elem()
}

type SubaccountServiceBindingInput interface {
	pulumi.Input

	ToSubaccountServiceBindingOutput() SubaccountServiceBindingOutput
	ToSubaccountServiceBindingOutputWithContext(ctx context.Context) SubaccountServiceBindingOutput
}

func (*SubaccountServiceBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**SubaccountServiceBinding)(nil)).Elem()
}

func (i *SubaccountServiceBinding) ToSubaccountServiceBindingOutput() SubaccountServiceBindingOutput {
	return i.ToSubaccountServiceBindingOutputWithContext(context.Background())
}

func (i *SubaccountServiceBinding) ToSubaccountServiceBindingOutputWithContext(ctx context.Context) SubaccountServiceBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubaccountServiceBindingOutput)
}

func (i *SubaccountServiceBinding) ToOutput(ctx context.Context) pulumix.Output[*SubaccountServiceBinding] {
	return pulumix.Output[*SubaccountServiceBinding]{
		OutputState: i.ToSubaccountServiceBindingOutputWithContext(ctx).OutputState,
	}
}

// SubaccountServiceBindingArrayInput is an input type that accepts SubaccountServiceBindingArray and SubaccountServiceBindingArrayOutput values.
// You can construct a concrete instance of `SubaccountServiceBindingArrayInput` via:
//
//	SubaccountServiceBindingArray{ SubaccountServiceBindingArgs{...} }
type SubaccountServiceBindingArrayInput interface {
	pulumi.Input

	ToSubaccountServiceBindingArrayOutput() SubaccountServiceBindingArrayOutput
	ToSubaccountServiceBindingArrayOutputWithContext(context.Context) SubaccountServiceBindingArrayOutput
}

type SubaccountServiceBindingArray []SubaccountServiceBindingInput

func (SubaccountServiceBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SubaccountServiceBinding)(nil)).Elem()
}

func (i SubaccountServiceBindingArray) ToSubaccountServiceBindingArrayOutput() SubaccountServiceBindingArrayOutput {
	return i.ToSubaccountServiceBindingArrayOutputWithContext(context.Background())
}

func (i SubaccountServiceBindingArray) ToSubaccountServiceBindingArrayOutputWithContext(ctx context.Context) SubaccountServiceBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubaccountServiceBindingArrayOutput)
}

func (i SubaccountServiceBindingArray) ToOutput(ctx context.Context) pulumix.Output[[]*SubaccountServiceBinding] {
	return pulumix.Output[[]*SubaccountServiceBinding]{
		OutputState: i.ToSubaccountServiceBindingArrayOutputWithContext(ctx).OutputState,
	}
}

// SubaccountServiceBindingMapInput is an input type that accepts SubaccountServiceBindingMap and SubaccountServiceBindingMapOutput values.
// You can construct a concrete instance of `SubaccountServiceBindingMapInput` via:
//
//	SubaccountServiceBindingMap{ "key": SubaccountServiceBindingArgs{...} }
type SubaccountServiceBindingMapInput interface {
	pulumi.Input

	ToSubaccountServiceBindingMapOutput() SubaccountServiceBindingMapOutput
	ToSubaccountServiceBindingMapOutputWithContext(context.Context) SubaccountServiceBindingMapOutput
}

type SubaccountServiceBindingMap map[string]SubaccountServiceBindingInput

func (SubaccountServiceBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SubaccountServiceBinding)(nil)).Elem()
}

func (i SubaccountServiceBindingMap) ToSubaccountServiceBindingMapOutput() SubaccountServiceBindingMapOutput {
	return i.ToSubaccountServiceBindingMapOutputWithContext(context.Background())
}

func (i SubaccountServiceBindingMap) ToSubaccountServiceBindingMapOutputWithContext(ctx context.Context) SubaccountServiceBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SubaccountServiceBindingMapOutput)
}

func (i SubaccountServiceBindingMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*SubaccountServiceBinding] {
	return pulumix.Output[map[string]*SubaccountServiceBinding]{
		OutputState: i.ToSubaccountServiceBindingMapOutputWithContext(ctx).OutputState,
	}
}

type SubaccountServiceBindingOutput struct{ *pulumi.OutputState }

func (SubaccountServiceBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SubaccountServiceBinding)(nil)).Elem()
}

func (o SubaccountServiceBindingOutput) ToSubaccountServiceBindingOutput() SubaccountServiceBindingOutput {
	return o
}

func (o SubaccountServiceBindingOutput) ToSubaccountServiceBindingOutputWithContext(ctx context.Context) SubaccountServiceBindingOutput {
	return o
}

func (o SubaccountServiceBindingOutput) ToOutput(ctx context.Context) pulumix.Output[*SubaccountServiceBinding] {
	return pulumix.Output[*SubaccountServiceBinding]{
		OutputState: o.OutputState,
	}
}

// Contains the resources associated with the binding.
func (o SubaccountServiceBindingOutput) BindResource() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SubaccountServiceBinding) pulumi.StringMapOutput { return v.BindResource }).(pulumi.StringMapOutput)
}

// The contextual data for the resource.
func (o SubaccountServiceBindingOutput) Context() pulumi.StringOutput {
	return o.ApplyT(func(v *SubaccountServiceBinding) pulumi.StringOutput { return v.Context }).(pulumi.StringOutput)
}

// The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
func (o SubaccountServiceBindingOutput) CreatedDate() pulumi.StringOutput {
	return o.ApplyT(func(v *SubaccountServiceBinding) pulumi.StringOutput { return v.CreatedDate }).(pulumi.StringOutput)
}

// The credentials to access the binding.
func (o SubaccountServiceBindingOutput) Credentials() pulumi.StringOutput {
	return o.ApplyT(func(v *SubaccountServiceBinding) pulumi.StringOutput { return v.Credentials }).(pulumi.StringOutput)
}

// The set of words or phrases assigned to the service binding.
func (o SubaccountServiceBindingOutput) Labels() pulumi.StringArrayMapOutput {
	return o.ApplyT(func(v *SubaccountServiceBinding) pulumi.StringArrayMapOutput { return v.Labels }).(pulumi.StringArrayMapOutput)
}

// The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
func (o SubaccountServiceBindingOutput) LastModified() pulumi.StringOutput {
	return o.ApplyT(func(v *SubaccountServiceBinding) pulumi.StringOutput { return v.LastModified }).(pulumi.StringOutput)
}

// The name of the service binding.
func (o SubaccountServiceBindingOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SubaccountServiceBinding) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The parameters of the service binding as a valid JSON object.
func (o SubaccountServiceBindingOutput) Parameters() pulumi.StringOutput {
	return o.ApplyT(func(v *SubaccountServiceBinding) pulumi.StringOutput { return v.Parameters }).(pulumi.StringOutput)
}

// Shows whether the service binding is ready.
func (o SubaccountServiceBindingOutput) Ready() pulumi.BoolOutput {
	return o.ApplyT(func(v *SubaccountServiceBinding) pulumi.BoolOutput { return v.Ready }).(pulumi.BoolOutput)
}

// The ID of the service instance associated with the binding.
func (o SubaccountServiceBindingOutput) ServiceInstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *SubaccountServiceBinding) pulumi.StringOutput { return v.ServiceInstanceId }).(pulumi.StringOutput)
}

// The current state of the service binding. Possible values are:
func (o SubaccountServiceBindingOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *SubaccountServiceBinding) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// The ID of the subaccount.
func (o SubaccountServiceBindingOutput) SubaccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *SubaccountServiceBinding) pulumi.StringOutput { return v.SubaccountId }).(pulumi.StringOutput)
}

type SubaccountServiceBindingArrayOutput struct{ *pulumi.OutputState }

func (SubaccountServiceBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SubaccountServiceBinding)(nil)).Elem()
}

func (o SubaccountServiceBindingArrayOutput) ToSubaccountServiceBindingArrayOutput() SubaccountServiceBindingArrayOutput {
	return o
}

func (o SubaccountServiceBindingArrayOutput) ToSubaccountServiceBindingArrayOutputWithContext(ctx context.Context) SubaccountServiceBindingArrayOutput {
	return o
}

func (o SubaccountServiceBindingArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*SubaccountServiceBinding] {
	return pulumix.Output[[]*SubaccountServiceBinding]{
		OutputState: o.OutputState,
	}
}

func (o SubaccountServiceBindingArrayOutput) Index(i pulumi.IntInput) SubaccountServiceBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SubaccountServiceBinding {
		return vs[0].([]*SubaccountServiceBinding)[vs[1].(int)]
	}).(SubaccountServiceBindingOutput)
}

type SubaccountServiceBindingMapOutput struct{ *pulumi.OutputState }

func (SubaccountServiceBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SubaccountServiceBinding)(nil)).Elem()
}

func (o SubaccountServiceBindingMapOutput) ToSubaccountServiceBindingMapOutput() SubaccountServiceBindingMapOutput {
	return o
}

func (o SubaccountServiceBindingMapOutput) ToSubaccountServiceBindingMapOutputWithContext(ctx context.Context) SubaccountServiceBindingMapOutput {
	return o
}

func (o SubaccountServiceBindingMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*SubaccountServiceBinding] {
	return pulumix.Output[map[string]*SubaccountServiceBinding]{
		OutputState: o.OutputState,
	}
}

func (o SubaccountServiceBindingMapOutput) MapIndex(k pulumi.StringInput) SubaccountServiceBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SubaccountServiceBinding {
		return vs[0].(map[string]*SubaccountServiceBinding)[vs[1].(string)]
	}).(SubaccountServiceBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SubaccountServiceBindingInput)(nil)).Elem(), &SubaccountServiceBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*SubaccountServiceBindingArrayInput)(nil)).Elem(), SubaccountServiceBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SubaccountServiceBindingMapInput)(nil)).Elem(), SubaccountServiceBindingMap{})
	pulumi.RegisterOutputType(SubaccountServiceBindingOutput{})
	pulumi.RegisterOutputType(SubaccountServiceBindingArrayOutput{})
	pulumi.RegisterOutputType(SubaccountServiceBindingMapOutput{})
}
