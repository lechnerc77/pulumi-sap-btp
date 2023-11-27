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
    public static class GetSubaccountEnvironmentInstances
    {
        /// <summary>
        /// Gets all the environment instances in a subaccount.
        /// 
        /// __Tip:__
        /// You must be assigned to the subaccount admin or viewer role.
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
        ///     var all = Btp.GetSubaccountEnvironmentInstances.Invoke(new()
        ///     {
        ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSubaccountEnvironmentInstancesResult> InvokeAsync(GetSubaccountEnvironmentInstancesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSubaccountEnvironmentInstancesResult>("btp:index/getSubaccountEnvironmentInstances:getSubaccountEnvironmentInstances", args ?? new GetSubaccountEnvironmentInstancesArgs(), options.WithDefaults());

        /// <summary>
        /// Gets all the environment instances in a subaccount.
        /// 
        /// __Tip:__
        /// You must be assigned to the subaccount admin or viewer role.
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
        ///     var all = Btp.GetSubaccountEnvironmentInstances.Invoke(new()
        ///     {
        ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetSubaccountEnvironmentInstancesResult> Invoke(GetSubaccountEnvironmentInstancesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSubaccountEnvironmentInstancesResult>("btp:index/getSubaccountEnvironmentInstances:getSubaccountEnvironmentInstances", args ?? new GetSubaccountEnvironmentInstancesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSubaccountEnvironmentInstancesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        [Input("subaccountId", required: true)]
        public string SubaccountId { get; set; } = null!;

        public GetSubaccountEnvironmentInstancesArgs()
        {
        }
        public static new GetSubaccountEnvironmentInstancesArgs Empty => new GetSubaccountEnvironmentInstancesArgs();
    }

    public sealed class GetSubaccountEnvironmentInstancesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        [Input("subaccountId", required: true)]
        public Input<string> SubaccountId { get; set; } = null!;

        public GetSubaccountEnvironmentInstancesInvokeArgs()
        {
        }
        public static new GetSubaccountEnvironmentInstancesInvokeArgs Empty => new GetSubaccountEnvironmentInstancesInvokeArgs();
    }


    [OutputType]
    public sealed class GetSubaccountEnvironmentInstancesResult
    {
        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        public readonly string SubaccountId;
        public readonly ImmutableArray<Outputs.GetSubaccountEnvironmentInstancesValueResult> Values;

        [OutputConstructor]
        private GetSubaccountEnvironmentInstancesResult(
            string id,

            string subaccountId,

            ImmutableArray<Outputs.GetSubaccountEnvironmentInstancesValueResult> values)
        {
            Id = id;
            SubaccountId = subaccountId;
            Values = values;
        }
    }
}