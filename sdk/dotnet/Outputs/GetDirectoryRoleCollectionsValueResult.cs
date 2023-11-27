// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace PulumiBtp.Btp.Outputs
{

    [OutputType]
    public sealed class GetDirectoryRoleCollectionsValueResult
    {
        /// <summary>
        /// The description of the role collection.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The name of the role collection.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Shows whether the role collection is read-only.
        /// </summary>
        public readonly bool ReadOnly;
        public readonly ImmutableArray<Outputs.GetDirectoryRoleCollectionsValueRoleResult> Roles;

        [OutputConstructor]
        private GetDirectoryRoleCollectionsValueResult(
            string description,

            string name,

            bool readOnly,

            ImmutableArray<Outputs.GetDirectoryRoleCollectionsValueRoleResult> roles)
        {
            Description = description;
            Name = name;
            ReadOnly = readOnly;
            Roles = roles;
        }
    }
}
