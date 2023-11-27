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
    public static class GetDirectoryUsers
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
        ///     var defaultidp = Btp.GetDirectoryUsers.Invoke(new()
        ///     {
        ///         DirectoryId = "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
        ///     });
        /// 
        ///     var mycustomidp = Btp.GetDirectoryUsers.Invoke(new()
        ///     {
        ///         DirectoryId = "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
        ///         Origin = "my-custom-idp",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDirectoryUsersResult> InvokeAsync(GetDirectoryUsersArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDirectoryUsersResult>("btp:index/getDirectoryUsers:getDirectoryUsers", args ?? new GetDirectoryUsersArgs(), options.WithDefaults());

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
        ///     var defaultidp = Btp.GetDirectoryUsers.Invoke(new()
        ///     {
        ///         DirectoryId = "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
        ///     });
        /// 
        ///     var mycustomidp = Btp.GetDirectoryUsers.Invoke(new()
        ///     {
        ///         DirectoryId = "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
        ///         Origin = "my-custom-idp",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetDirectoryUsersResult> Invoke(GetDirectoryUsersInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDirectoryUsersResult>("btp:index/getDirectoryUsers:getDirectoryUsers", args ?? new GetDirectoryUsersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDirectoryUsersArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the directory.
        /// </summary>
        [Input("directoryId", required: true)]
        public string DirectoryId { get; set; } = null!;

        /// <summary>
        /// The identity provider that hosts the user. The default value is 'ldap'.
        /// </summary>
        [Input("origin")]
        public string? Origin { get; set; }

        public GetDirectoryUsersArgs()
        {
        }
        public static new GetDirectoryUsersArgs Empty => new GetDirectoryUsersArgs();
    }

    public sealed class GetDirectoryUsersInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the directory.
        /// </summary>
        [Input("directoryId", required: true)]
        public Input<string> DirectoryId { get; set; } = null!;

        /// <summary>
        /// The identity provider that hosts the user. The default value is 'ldap'.
        /// </summary>
        [Input("origin")]
        public Input<string>? Origin { get; set; }

        public GetDirectoryUsersInvokeArgs()
        {
        }
        public static new GetDirectoryUsersInvokeArgs Empty => new GetDirectoryUsersInvokeArgs();
    }


    [OutputType]
    public sealed class GetDirectoryUsersResult
    {
        /// <summary>
        /// The ID of the directory.
        /// </summary>
        public readonly string DirectoryId;
        /// <summary>
        /// The ID of the directory.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The identity provider that hosts the user. The default value is 'ldap'.
        /// </summary>
        public readonly string Origin;
        /// <summary>
        /// The list of users assigned to the directory.
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private GetDirectoryUsersResult(
            string directoryId,

            string id,

            string origin,

            ImmutableArray<string> values)
        {
            DirectoryId = directoryId;
            Id = id;
            Origin = origin;
            Values = values;
        }
    }
}
