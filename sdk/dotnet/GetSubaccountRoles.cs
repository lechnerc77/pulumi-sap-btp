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
    public static class GetSubaccountRoles
    {
        /// <summary>
        /// Gets all roles.
        /// 
        /// __Further documentation:__
        /// &lt;https://help.sap.com/docs/btp/sap-business-technology-platform/role-collections-and-roles-in-global-accounts-directories-and-subaccounts&gt;
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
        ///     var all = Btp.GetSubaccountRoles.Invoke(new()
        ///     {
        ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSubaccountRolesResult> InvokeAsync(GetSubaccountRolesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSubaccountRolesResult>("btp:index/getSubaccountRoles:getSubaccountRoles", args ?? new GetSubaccountRolesArgs(), options.WithDefaults());

        /// <summary>
        /// Gets all roles.
        /// 
        /// __Further documentation:__
        /// &lt;https://help.sap.com/docs/btp/sap-business-technology-platform/role-collections-and-roles-in-global-accounts-directories-and-subaccounts&gt;
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
        ///     var all = Btp.GetSubaccountRoles.Invoke(new()
        ///     {
        ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetSubaccountRolesResult> Invoke(GetSubaccountRolesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSubaccountRolesResult>("btp:index/getSubaccountRoles:getSubaccountRoles", args ?? new GetSubaccountRolesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSubaccountRolesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        [Input("subaccountId", required: true)]
        public string SubaccountId { get; set; } = null!;

        public GetSubaccountRolesArgs()
        {
        }
        public static new GetSubaccountRolesArgs Empty => new GetSubaccountRolesArgs();
    }

    public sealed class GetSubaccountRolesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        [Input("subaccountId", required: true)]
        public Input<string> SubaccountId { get; set; } = null!;

        public GetSubaccountRolesInvokeArgs()
        {
        }
        public static new GetSubaccountRolesInvokeArgs Empty => new GetSubaccountRolesInvokeArgs();
    }


    [OutputType]
    public sealed class GetSubaccountRolesResult
    {
        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        public readonly string SubaccountId;
        public readonly ImmutableArray<Outputs.GetSubaccountRolesValueResult> Values;

        [OutputConstructor]
        private GetSubaccountRolesResult(
            string id,

            string subaccountId,

            ImmutableArray<Outputs.GetSubaccountRolesValueResult> values)
        {
            Id = id;
            SubaccountId = subaccountId;
            Values = values;
        }
    }
}
