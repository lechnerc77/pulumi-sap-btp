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
    public static class GetSubaccountLabels
    {
        /// <summary>
        /// Gets all the user-defined labels that are currently assigned to a specific subaccount.
        /// 
        /// __Tip:__
        /// You must be assigned to the global account admin or viewer role. These roles assignments are not needed for directories you are the directory admin.
        /// 
        /// __Further documentation:__
        /// &lt;https://help.sap.com/docs/btp/sap-business-technology-platform/account-model&gt;
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
        ///     var all = Btp.GetSubaccountLabels.Invoke(new()
        ///     {
        ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSubaccountLabelsResult> InvokeAsync(GetSubaccountLabelsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSubaccountLabelsResult>("btp:index/getSubaccountLabels:getSubaccountLabels", args ?? new GetSubaccountLabelsArgs(), options.WithDefaults());

        /// <summary>
        /// Gets all the user-defined labels that are currently assigned to a specific subaccount.
        /// 
        /// __Tip:__
        /// You must be assigned to the global account admin or viewer role. These roles assignments are not needed for directories you are the directory admin.
        /// 
        /// __Further documentation:__
        /// &lt;https://help.sap.com/docs/btp/sap-business-technology-platform/account-model&gt;
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
        ///     var all = Btp.GetSubaccountLabels.Invoke(new()
        ///     {
        ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetSubaccountLabelsResult> Invoke(GetSubaccountLabelsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSubaccountLabelsResult>("btp:index/getSubaccountLabels:getSubaccountLabels", args ?? new GetSubaccountLabelsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSubaccountLabelsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        [Input("subaccountId", required: true)]
        public string SubaccountId { get; set; } = null!;

        public GetSubaccountLabelsArgs()
        {
        }
        public static new GetSubaccountLabelsArgs Empty => new GetSubaccountLabelsArgs();
    }

    public sealed class GetSubaccountLabelsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        [Input("subaccountId", required: true)]
        public Input<string> SubaccountId { get; set; } = null!;

        public GetSubaccountLabelsInvokeArgs()
        {
        }
        public static new GetSubaccountLabelsInvokeArgs Empty => new GetSubaccountLabelsInvokeArgs();
    }


    [OutputType]
    public sealed class GetSubaccountLabelsResult
    {
        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        public readonly string SubaccountId;
        /// <summary>
        /// Contains the label values
        /// </summary>
        public readonly ImmutableDictionary<string, ImmutableArray<string>> Values;

        [OutputConstructor]
        private GetSubaccountLabelsResult(
            string id,

            string subaccountId,

            ImmutableDictionary<string, ImmutableArray<string>> values)
        {
            Id = id;
            SubaccountId = subaccountId;
            Values = values;
        }
    }
}
