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
    public static class GetDirectoryRoles
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
        ///     var all = Btp.GetDirectoryRoles.Invoke(new()
        ///     {
        ///         DirectoryId = "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDirectoryRolesResult> InvokeAsync(GetDirectoryRolesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDirectoryRolesResult>("btp:index/getDirectoryRoles:getDirectoryRoles", args ?? new GetDirectoryRolesArgs(), options.WithDefaults());

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
        ///     var all = Btp.GetDirectoryRoles.Invoke(new()
        ///     {
        ///         DirectoryId = "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetDirectoryRolesResult> Invoke(GetDirectoryRolesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDirectoryRolesResult>("btp:index/getDirectoryRoles:getDirectoryRoles", args ?? new GetDirectoryRolesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDirectoryRolesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the directory.
        /// </summary>
        [Input("directoryId", required: true)]
        public string DirectoryId { get; set; } = null!;

        public GetDirectoryRolesArgs()
        {
        }
        public static new GetDirectoryRolesArgs Empty => new GetDirectoryRolesArgs();
    }

    public sealed class GetDirectoryRolesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the directory.
        /// </summary>
        [Input("directoryId", required: true)]
        public Input<string> DirectoryId { get; set; } = null!;

        public GetDirectoryRolesInvokeArgs()
        {
        }
        public static new GetDirectoryRolesInvokeArgs Empty => new GetDirectoryRolesInvokeArgs();
    }


    [OutputType]
    public sealed class GetDirectoryRolesResult
    {
        /// <summary>
        /// The ID of the directory.
        /// </summary>
        public readonly string DirectoryId;
        /// <summary>
        /// The ID of the directory.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetDirectoryRolesValueResult> Values;

        [OutputConstructor]
        private GetDirectoryRolesResult(
            string directoryId,

            string id,

            ImmutableArray<Outputs.GetDirectoryRolesValueResult> values)
        {
            DirectoryId = directoryId;
            Id = id;
            Values = values;
        }
    }
}
