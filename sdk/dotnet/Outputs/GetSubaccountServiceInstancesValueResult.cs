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
    public sealed class GetSubaccountServiceInstancesValueResult
    {
        /// <summary>
        /// Contextual data for the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Context;
        /// <summary>
        /// The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        /// </summary>
        public readonly string CreatedDate;
        /// <summary>
        /// The ID of the service instance.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The set of words or phrases assigned to the service instance.
        /// </summary>
        public readonly ImmutableDictionary<string, ImmutableArray<string>> Labels;
        /// <summary>
        /// The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        /// </summary>
        public readonly string LastModified;
        /// <summary>
        /// The name of the service instance.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The platform ID.
        /// </summary>
        public readonly string PlatformId;
        public readonly bool Ready;
        /// <summary>
        /// The ID of the service plan.
        /// </summary>
        public readonly string ServiceplanId;
        /// <summary>
        /// Shows whether the resource can be used.
        /// </summary>
        public readonly bool Usable;

        [OutputConstructor]
        private GetSubaccountServiceInstancesValueResult(
            ImmutableDictionary<string, string> context,

            string createdDate,

            string id,

            ImmutableDictionary<string, ImmutableArray<string>> labels,

            string lastModified,

            string name,

            string platformId,

            bool ready,

            string serviceplanId,

            bool usable)
        {
            Context = context;
            CreatedDate = createdDate;
            Id = id;
            Labels = labels;
            LastModified = lastModified;
            Name = name;
            PlatformId = platformId;
            Ready = ready;
            ServiceplanId = serviceplanId;
            Usable = usable;
        }
    }
}