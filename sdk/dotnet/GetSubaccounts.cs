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
    public static class GetSubaccounts
    {
        /// <summary>
        /// Gets all the subaccounts in a global account, including the subaccounts in directories.
        /// 
        /// __Tip:__
        /// You must be assigned to the admin or viewer role of the global account, directory.
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
        ///     var all = Btp.GetSubaccounts.Invoke();
        /// 
        ///     var filtered = Btp.GetSubaccounts.Invoke(new()
        ///     {
        ///         LabelsFilter = "my-label=my-value",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSubaccountsResult> InvokeAsync(GetSubaccountsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSubaccountsResult>("btp:index/getSubaccounts:getSubaccounts", args ?? new GetSubaccountsArgs(), options.WithDefaults());

        /// <summary>
        /// Gets all the subaccounts in a global account, including the subaccounts in directories.
        /// 
        /// __Tip:__
        /// You must be assigned to the admin or viewer role of the global account, directory.
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
        ///     var all = Btp.GetSubaccounts.Invoke();
        /// 
        ///     var filtered = Btp.GetSubaccounts.Invoke(new()
        ///     {
        ///         LabelsFilter = "my-label=my-value",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetSubaccountsResult> Invoke(GetSubaccountsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSubaccountsResult>("btp:index/getSubaccounts:getSubaccounts", args ?? new GetSubaccountsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSubaccountsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filters the response based on the labels query.
        /// </summary>
        [Input("labelsFilter")]
        public string? LabelsFilter { get; set; }

        public GetSubaccountsArgs()
        {
        }
        public static new GetSubaccountsArgs Empty => new GetSubaccountsArgs();
    }

    public sealed class GetSubaccountsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filters the response based on the labels query.
        /// </summary>
        [Input("labelsFilter")]
        public Input<string>? LabelsFilter { get; set; }

        public GetSubaccountsInvokeArgs()
        {
        }
        public static new GetSubaccountsInvokeArgs Empty => new GetSubaccountsInvokeArgs();
    }


    [OutputType]
    public sealed class GetSubaccountsResult
    {
        /// <summary>
        /// The ID of the global account.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Filters the response based on the labels query.
        /// </summary>
        public readonly string? LabelsFilter;
        /// <summary>
        /// The subaccounts contained in the global account.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSubaccountsValueResult> Values;

        [OutputConstructor]
        private GetSubaccountsResult(
            string id,

            string? labelsFilter,

            ImmutableArray<Outputs.GetSubaccountsValueResult> values)
        {
            Id = id;
            LabelsFilter = labelsFilter;
            Values = values;
        }
    }
}
