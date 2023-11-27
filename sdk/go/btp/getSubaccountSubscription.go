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

// Gets details of a specific multitenant application to which a subaccount is entitled to subscribe. If this application is in a different global account than the current one, you need to specify its plan with '--plan'.
//
// __Tip:__
// You must be assigned to the subaccount admin or viewer role.
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
//			_, err := btp.LookupSubaccountSubscription(ctx, &btp.LookupSubaccountSubscriptionArgs{
//				AppName:      "content-agent-ui",
//				PlanName:     "free",
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
func LookupSubaccountSubscription(ctx *pulumi.Context, args *LookupSubaccountSubscriptionArgs, opts ...pulumi.InvokeOption) (*LookupSubaccountSubscriptionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSubaccountSubscriptionResult
	err := ctx.Invoke("btp:index/getSubaccountSubscription:getSubaccountSubscription", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSubaccountSubscription.
type LookupSubaccountSubscriptionArgs struct {
	// The unique registration name of the deployed multitenant application as defined by the app developer.
	AppName string `pulumi:"appName"`
	// The plan name of the application to which the consumer has subscribed.
	PlanName string `pulumi:"planName"`
	// The ID of the subaccount.
	SubaccountId string `pulumi:"subaccountId"`
}

// A collection of values returned by getSubaccountSubscription.
type LookupSubaccountSubscriptionResult struct {
	// The list of features specific to this plan.
	AdditionalPlanFeatures []string `pulumi:"additionalPlanFeatures"`
	// The ID returned by XSUAA after the app provider has performed a bind of the multitenant application to a XSUAA service instance.
	AppId string `pulumi:"appId"`
	// The unique registration name of the deployed multitenant application as defined by the app developer.
	AppName string `pulumi:"appName"`
	// The authentication provider of the multitenant application. * XSUAA is the SAP Authorization and Trust Management service that defines scopes and permissions for users as tenants at the global account level. * IAS is Identity Authentication Service that defines scopes and permissions for users in zones (common data isolation systems across systems, SaaS tenants, and services).
	AuthenticationProvider string `pulumi:"authenticationProvider"`
	// The technical name of the category defined by the app developer to which the multitenant application is grouped in customer-facing UIs.
	Category string `pulumi:"category"`
	// The commercial name of the deployed multitenant application as defined by the app developer.
	CommercialAppName string `pulumi:"commercialAppName"`
	// The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
	CreatedDate string `pulumi:"createdDate"`
	// Shows whether the application was developed by a customer. If not, then the application is developed by the cloud operator, such as SAP.
	CustomerDeveloped bool `pulumi:"customerDeveloped"`
	// The description of the multitenant application.
	Description string `pulumi:"description"`
	// The display name of the application for customer-facing UIs.
	DisplayName string `pulumi:"displayName"`
	// The name of the formations solution associated with the multitenant application.
	FormationSolutionName string `pulumi:"formationSolutionName"`
	// The ID of the associated global account.
	GlobalaccountId string `pulumi:"globalaccountId"`
	// The technical ID generated by XSUAA for a multitenant application when a consumer subscribes to the application.
	Id string `pulumi:"id"`
	// The set of words or phrases assigned to the multitenant application subscription.
	Labels map[string][]string `pulumi:"labels"`
	// The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
	LastModified string `pulumi:"lastModified"`
	// The parameters of the subscription as a valid JSON object.
	Parameters string `pulumi:"parameters"`
	// The plan name of the application to which the consumer has subscribed.
	PlanName string `pulumi:"planName"`
	// The ID of the landscape-specific environment.
	PlatformEntityId string `pulumi:"platformEntityId"`
	// The total amount the subscribed subaccount is entitled to consume.
	Quota int `pulumi:"quota"`
	// The subscription state of the subaccount regarding the multitenant application.
	State string `pulumi:"state"`
	// The ID of the subaccount.
	SubaccountId string `pulumi:"subaccountId"`
	// The ID of the subaccount which is subscribed to the multitenant application.
	SubscribedSubaccountId string `pulumi:"subscribedSubaccountId"`
	// The ID of the tenant which is subscribed to a multitenant application.
	SubscribedTenantId string `pulumi:"subscribedTenantId"`
	// The URL for app users to launch the subscribed application.
	SubscriptionUrl string `pulumi:"subscriptionUrl"`
	// Specifies whether a consumer, whose subaccount is subscribed to the application, can change its subscriptions parameters.
	SupportsParametersUpdates bool `pulumi:"supportsParametersUpdates"`
	// Specifies whether a consumer, whose subaccount is subscribed to the application, can change the subscription to a different plan that is available for this application and subaccount.
	SupportsPlanUpdates bool `pulumi:"supportsPlanUpdates"`
	// The tenant ID of the application provider.
	TenantId string `pulumi:"tenantId"`
}

func LookupSubaccountSubscriptionOutput(ctx *pulumi.Context, args LookupSubaccountSubscriptionOutputArgs, opts ...pulumi.InvokeOption) LookupSubaccountSubscriptionResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSubaccountSubscriptionResult, error) {
			args := v.(LookupSubaccountSubscriptionArgs)
			r, err := LookupSubaccountSubscription(ctx, &args, opts...)
			var s LookupSubaccountSubscriptionResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSubaccountSubscriptionResultOutput)
}

// A collection of arguments for invoking getSubaccountSubscription.
type LookupSubaccountSubscriptionOutputArgs struct {
	// The unique registration name of the deployed multitenant application as defined by the app developer.
	AppName pulumi.StringInput `pulumi:"appName"`
	// The plan name of the application to which the consumer has subscribed.
	PlanName pulumi.StringInput `pulumi:"planName"`
	// The ID of the subaccount.
	SubaccountId pulumi.StringInput `pulumi:"subaccountId"`
}

func (LookupSubaccountSubscriptionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSubaccountSubscriptionArgs)(nil)).Elem()
}

// A collection of values returned by getSubaccountSubscription.
type LookupSubaccountSubscriptionResultOutput struct{ *pulumi.OutputState }

func (LookupSubaccountSubscriptionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSubaccountSubscriptionResult)(nil)).Elem()
}

func (o LookupSubaccountSubscriptionResultOutput) ToLookupSubaccountSubscriptionResultOutput() LookupSubaccountSubscriptionResultOutput {
	return o
}

func (o LookupSubaccountSubscriptionResultOutput) ToLookupSubaccountSubscriptionResultOutputWithContext(ctx context.Context) LookupSubaccountSubscriptionResultOutput {
	return o
}

func (o LookupSubaccountSubscriptionResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupSubaccountSubscriptionResult] {
	return pulumix.Output[LookupSubaccountSubscriptionResult]{
		OutputState: o.OutputState,
	}
}

// The list of features specific to this plan.
func (o LookupSubaccountSubscriptionResultOutput) AdditionalPlanFeatures() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) []string { return v.AdditionalPlanFeatures }).(pulumi.StringArrayOutput)
}

// The ID returned by XSUAA after the app provider has performed a bind of the multitenant application to a XSUAA service instance.
func (o LookupSubaccountSubscriptionResultOutput) AppId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) string { return v.AppId }).(pulumi.StringOutput)
}

// The unique registration name of the deployed multitenant application as defined by the app developer.
func (o LookupSubaccountSubscriptionResultOutput) AppName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) string { return v.AppName }).(pulumi.StringOutput)
}

// The authentication provider of the multitenant application. * XSUAA is the SAP Authorization and Trust Management service that defines scopes and permissions for users as tenants at the global account level. * IAS is Identity Authentication Service that defines scopes and permissions for users in zones (common data isolation systems across systems, SaaS tenants, and services).
func (o LookupSubaccountSubscriptionResultOutput) AuthenticationProvider() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) string { return v.AuthenticationProvider }).(pulumi.StringOutput)
}

// The technical name of the category defined by the app developer to which the multitenant application is grouped in customer-facing UIs.
func (o LookupSubaccountSubscriptionResultOutput) Category() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) string { return v.Category }).(pulumi.StringOutput)
}

// The commercial name of the deployed multitenant application as defined by the app developer.
func (o LookupSubaccountSubscriptionResultOutput) CommercialAppName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) string { return v.CommercialAppName }).(pulumi.StringOutput)
}

// The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
func (o LookupSubaccountSubscriptionResultOutput) CreatedDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) string { return v.CreatedDate }).(pulumi.StringOutput)
}

// Shows whether the application was developed by a customer. If not, then the application is developed by the cloud operator, such as SAP.
func (o LookupSubaccountSubscriptionResultOutput) CustomerDeveloped() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) bool { return v.CustomerDeveloped }).(pulumi.BoolOutput)
}

// The description of the multitenant application.
func (o LookupSubaccountSubscriptionResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) string { return v.Description }).(pulumi.StringOutput)
}

// The display name of the application for customer-facing UIs.
func (o LookupSubaccountSubscriptionResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// The name of the formations solution associated with the multitenant application.
func (o LookupSubaccountSubscriptionResultOutput) FormationSolutionName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) string { return v.FormationSolutionName }).(pulumi.StringOutput)
}

// The ID of the associated global account.
func (o LookupSubaccountSubscriptionResultOutput) GlobalaccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) string { return v.GlobalaccountId }).(pulumi.StringOutput)
}

// The technical ID generated by XSUAA for a multitenant application when a consumer subscribes to the application.
func (o LookupSubaccountSubscriptionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) string { return v.Id }).(pulumi.StringOutput)
}

// The set of words or phrases assigned to the multitenant application subscription.
func (o LookupSubaccountSubscriptionResultOutput) Labels() pulumi.StringArrayMapOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) map[string][]string { return v.Labels }).(pulumi.StringArrayMapOutput)
}

// The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
func (o LookupSubaccountSubscriptionResultOutput) LastModified() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) string { return v.LastModified }).(pulumi.StringOutput)
}

// The parameters of the subscription as a valid JSON object.
func (o LookupSubaccountSubscriptionResultOutput) Parameters() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) string { return v.Parameters }).(pulumi.StringOutput)
}

// The plan name of the application to which the consumer has subscribed.
func (o LookupSubaccountSubscriptionResultOutput) PlanName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) string { return v.PlanName }).(pulumi.StringOutput)
}

// The ID of the landscape-specific environment.
func (o LookupSubaccountSubscriptionResultOutput) PlatformEntityId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) string { return v.PlatformEntityId }).(pulumi.StringOutput)
}

// The total amount the subscribed subaccount is entitled to consume.
func (o LookupSubaccountSubscriptionResultOutput) Quota() pulumi.IntOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) int { return v.Quota }).(pulumi.IntOutput)
}

// The subscription state of the subaccount regarding the multitenant application.
func (o LookupSubaccountSubscriptionResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) string { return v.State }).(pulumi.StringOutput)
}

// The ID of the subaccount.
func (o LookupSubaccountSubscriptionResultOutput) SubaccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) string { return v.SubaccountId }).(pulumi.StringOutput)
}

// The ID of the subaccount which is subscribed to the multitenant application.
func (o LookupSubaccountSubscriptionResultOutput) SubscribedSubaccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) string { return v.SubscribedSubaccountId }).(pulumi.StringOutput)
}

// The ID of the tenant which is subscribed to a multitenant application.
func (o LookupSubaccountSubscriptionResultOutput) SubscribedTenantId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) string { return v.SubscribedTenantId }).(pulumi.StringOutput)
}

// The URL for app users to launch the subscribed application.
func (o LookupSubaccountSubscriptionResultOutput) SubscriptionUrl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) string { return v.SubscriptionUrl }).(pulumi.StringOutput)
}

// Specifies whether a consumer, whose subaccount is subscribed to the application, can change its subscriptions parameters.
func (o LookupSubaccountSubscriptionResultOutput) SupportsParametersUpdates() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) bool { return v.SupportsParametersUpdates }).(pulumi.BoolOutput)
}

// Specifies whether a consumer, whose subaccount is subscribed to the application, can change the subscription to a different plan that is available for this application and subaccount.
func (o LookupSubaccountSubscriptionResultOutput) SupportsPlanUpdates() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) bool { return v.SupportsPlanUpdates }).(pulumi.BoolOutput)
}

// The tenant ID of the application provider.
func (o LookupSubaccountSubscriptionResultOutput) TenantId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubaccountSubscriptionResult) string { return v.TenantId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSubaccountSubscriptionResultOutput{})
}
