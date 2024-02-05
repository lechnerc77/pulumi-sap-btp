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
    public static class GetDirectories
    {
        /// <summary>
        /// Gets all the directories in a global account, including the directories in directories.
        /// 
        /// __Tip:__
        /// You must be assigned to the admin or viewer role of the global account, directory.
        /// </summary>
        public static Task<GetDirectoriesResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDirectoriesResult>("btp:index/getDirectories:getDirectories", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Gets all the directories in a global account, including the directories in directories.
        /// 
        /// __Tip:__
        /// You must be assigned to the admin or viewer role of the global account, directory.
        /// </summary>
        public static Output<GetDirectoriesResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDirectoriesResult>("btp:index/getDirectories:getDirectories", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetDirectoriesResult
    {
        /// <summary>
        /// The ID of the global account.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The directories contained in the global account.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDirectoriesValueResult> Values;

        [OutputConstructor]
        private GetDirectoriesResult(
            string id,

            ImmutableArray<Outputs.GetDirectoriesValueResult> values)
        {
            Id = id;
            Values = values;
        }
    }
}
