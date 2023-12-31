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
    public static class GetDirectoryRoleCollections
    {
        /// <summary>
        /// Gets all role collections.
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
        ///     var all = Btp.GetDirectoryRoleCollections.Invoke(new()
        ///     {
        ///         DirectoryId = "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDirectoryRoleCollectionsResult> InvokeAsync(GetDirectoryRoleCollectionsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDirectoryRoleCollectionsResult>("btp:index/getDirectoryRoleCollections:getDirectoryRoleCollections", args ?? new GetDirectoryRoleCollectionsArgs(), options.WithDefaults());

        /// <summary>
        /// Gets all role collections.
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
        ///     var all = Btp.GetDirectoryRoleCollections.Invoke(new()
        ///     {
        ///         DirectoryId = "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetDirectoryRoleCollectionsResult> Invoke(GetDirectoryRoleCollectionsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDirectoryRoleCollectionsResult>("btp:index/getDirectoryRoleCollections:getDirectoryRoleCollections", args ?? new GetDirectoryRoleCollectionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDirectoryRoleCollectionsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the directory.
        /// </summary>
        [Input("directoryId", required: true)]
        public string DirectoryId { get; set; } = null!;

        public GetDirectoryRoleCollectionsArgs()
        {
        }
        public static new GetDirectoryRoleCollectionsArgs Empty => new GetDirectoryRoleCollectionsArgs();
    }

    public sealed class GetDirectoryRoleCollectionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the directory.
        /// </summary>
        [Input("directoryId", required: true)]
        public Input<string> DirectoryId { get; set; } = null!;

        public GetDirectoryRoleCollectionsInvokeArgs()
        {
        }
        public static new GetDirectoryRoleCollectionsInvokeArgs Empty => new GetDirectoryRoleCollectionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetDirectoryRoleCollectionsResult
    {
        /// <summary>
        /// The ID of the directory.
        /// </summary>
        public readonly string DirectoryId;
        /// <summary>
        /// The ID of the directory.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetDirectoryRoleCollectionsValueResult> Values;

        [OutputConstructor]
        private GetDirectoryRoleCollectionsResult(
            string directoryId,

            string id,

            ImmutableArray<Outputs.GetDirectoryRoleCollectionsValueResult> values)
        {
            DirectoryId = directoryId;
            Id = id;
            Values = values;
        }
    }
}
