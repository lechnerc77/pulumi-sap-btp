// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace PulumiBtp.Btp
{
    public static class GetSubaccountServicePlans
    {
        /// <summary>
        /// Lists the plans of services that your subaccount is entitled to use in your environment.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Btp = Pulumi.Btp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Btp.GetSubaccountServicePlans.Invoke(new()
        ///     {
        ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
        ///     });
        /// 
        ///     var sapbtp = Btp.GetSubaccountServicePlans.Invoke(new()
        ///     {
        ///         Environment = "sapbtp",
        ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
        ///     });
        /// 
        ///     var k8s = Btp.GetSubaccountServicePlans.Invoke(new()
        ///     {
        ///         Environment = "kubernetes",
        ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
        ///     });
        /// 
        ///     var labeled = Btp.GetSubaccountServicePlans.Invoke(new()
        ///     {
        ///         LabelsFilter = "commercial_name eq 'application'",
        ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSubaccountServicePlansResult> InvokeAsync(GetSubaccountServicePlansArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSubaccountServicePlansResult>("btp:index/getSubaccountServicePlans:getSubaccountServicePlans", args ?? new GetSubaccountServicePlansArgs(), options.WithDefaults());

        /// <summary>
        /// Lists the plans of services that your subaccount is entitled to use in your environment.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Btp = Pulumi.Btp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Btp.GetSubaccountServicePlans.Invoke(new()
        ///     {
        ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
        ///     });
        /// 
        ///     var sapbtp = Btp.GetSubaccountServicePlans.Invoke(new()
        ///     {
        ///         Environment = "sapbtp",
        ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
        ///     });
        /// 
        ///     var k8s = Btp.GetSubaccountServicePlans.Invoke(new()
        ///     {
        ///         Environment = "kubernetes",
        ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
        ///     });
        /// 
        ///     var labeled = Btp.GetSubaccountServicePlans.Invoke(new()
        ///     {
        ///         LabelsFilter = "commercial_name eq 'application'",
        ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetSubaccountServicePlansResult> Invoke(GetSubaccountServicePlansInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSubaccountServicePlansResult>("btp:index/getSubaccountServicePlans:getSubaccountServicePlans", args ?? new GetSubaccountServicePlansInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSubaccountServicePlansArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filter the response on the environment (sapbtp, kubernetes, cloudfoundry).
        /// </summary>
        [Input("environment")]
        public string? Environment { get; set; }

        /// <summary>
        /// Filters the response based on the field query.
        /// </summary>
        [Input("fieldsFilter")]
        public string? FieldsFilter { get; set; }

        /// <summary>
        /// Filters the response based on the labels query.
        /// </summary>
        [Input("labelsFilter")]
        public string? LabelsFilter { get; set; }

        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        [Input("subaccountId", required: true)]
        public string SubaccountId { get; set; } = null!;

        public GetSubaccountServicePlansArgs()
        {
        }
        public static new GetSubaccountServicePlansArgs Empty => new GetSubaccountServicePlansArgs();
    }

    public sealed class GetSubaccountServicePlansInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filter the response on the environment (sapbtp, kubernetes, cloudfoundry).
        /// </summary>
        [Input("environment")]
        public Input<string>? Environment { get; set; }

        /// <summary>
        /// Filters the response based on the field query.
        /// </summary>
        [Input("fieldsFilter")]
        public Input<string>? FieldsFilter { get; set; }

        /// <summary>
        /// Filters the response based on the labels query.
        /// </summary>
        [Input("labelsFilter")]
        public Input<string>? LabelsFilter { get; set; }

        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        [Input("subaccountId", required: true)]
        public Input<string> SubaccountId { get; set; } = null!;

        public GetSubaccountServicePlansInvokeArgs()
        {
        }
        public static new GetSubaccountServicePlansInvokeArgs Empty => new GetSubaccountServicePlansInvokeArgs();
    }


    [OutputType]
    public sealed class GetSubaccountServicePlansResult
    {
        /// <summary>
        /// Filter the response on the environment (sapbtp, kubernetes, cloudfoundry).
        /// </summary>
        public readonly string? Environment;
        /// <summary>
        /// Filters the response based on the field query.
        /// </summary>
        public readonly string? FieldsFilter;
        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Filters the response based on the labels query.
        /// </summary>
        public readonly string? LabelsFilter;
        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        public readonly string SubaccountId;
        public readonly ImmutableArray<Outputs.GetSubaccountServicePlansValueResult> Values;

        [OutputConstructor]
        private GetSubaccountServicePlansResult(
            string? environment,

            string? fieldsFilter,

            string id,

            string? labelsFilter,

            string subaccountId,

            ImmutableArray<Outputs.GetSubaccountServicePlansValueResult> values)
        {
            Environment = environment;
            FieldsFilter = fieldsFilter;
            Id = id;
            LabelsFilter = labelsFilter;
            SubaccountId = subaccountId;
            Values = values;
        }
    }
}
