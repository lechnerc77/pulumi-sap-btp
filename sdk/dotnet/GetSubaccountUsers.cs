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
    public static class GetSubaccountUsers
    {
        /// <summary>
        /// Gets all users.
        /// 
        /// __Further documentation:__
        /// &lt;https://help.sap.com/docs/btp/sap-business-technology-platform/user-and-member-management&gt;
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
        ///     var defaultidp = Btp.GetSubaccountUsers.Invoke(new()
        ///     {
        ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
        ///     });
        /// 
        ///     var mycustomidp = Btp.GetSubaccountUsers.Invoke(new()
        ///     {
        ///         Origin = "my-custom-idp",
        ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSubaccountUsersResult> InvokeAsync(GetSubaccountUsersArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSubaccountUsersResult>("btp:index/getSubaccountUsers:getSubaccountUsers", args ?? new GetSubaccountUsersArgs(), options.WithDefaults());

        /// <summary>
        /// Gets all users.
        /// 
        /// __Further documentation:__
        /// &lt;https://help.sap.com/docs/btp/sap-business-technology-platform/user-and-member-management&gt;
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
        ///     var defaultidp = Btp.GetSubaccountUsers.Invoke(new()
        ///     {
        ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
        ///     });
        /// 
        ///     var mycustomidp = Btp.GetSubaccountUsers.Invoke(new()
        ///     {
        ///         Origin = "my-custom-idp",
        ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetSubaccountUsersResult> Invoke(GetSubaccountUsersInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSubaccountUsersResult>("btp:index/getSubaccountUsers:getSubaccountUsers", args ?? new GetSubaccountUsersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSubaccountUsersArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The identity provider that hosts the user. The default value is 'ldap'.
        /// </summary>
        [Input("origin")]
        public string? Origin { get; set; }

        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        [Input("subaccountId", required: true)]
        public string SubaccountId { get; set; } = null!;

        public GetSubaccountUsersArgs()
        {
        }
        public static new GetSubaccountUsersArgs Empty => new GetSubaccountUsersArgs();
    }

    public sealed class GetSubaccountUsersInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The identity provider that hosts the user. The default value is 'ldap'.
        /// </summary>
        [Input("origin")]
        public Input<string>? Origin { get; set; }

        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        [Input("subaccountId", required: true)]
        public Input<string> SubaccountId { get; set; } = null!;

        public GetSubaccountUsersInvokeArgs()
        {
        }
        public static new GetSubaccountUsersInvokeArgs Empty => new GetSubaccountUsersInvokeArgs();
    }


    [OutputType]
    public sealed class GetSubaccountUsersResult
    {
        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The identity provider that hosts the user. The default value is 'ldap'.
        /// </summary>
        public readonly string Origin;
        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        public readonly string SubaccountId;
        /// <summary>
        /// The list of users assigned to the subaccount.
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private GetSubaccountUsersResult(
            string id,

            string origin,

            string subaccountId,

            ImmutableArray<string> values)
        {
            Id = id;
            Origin = origin;
            SubaccountId = subaccountId;
            Values = values;
        }
    }
}
