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
    public sealed class GetSubaccountEnvironmentInstancesValueResult
    {
        /// <summary>
        /// The ID of the associated environment broker.
        /// </summary>
        public readonly string BrokerId;
        /// <summary>
        /// The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        /// </summary>
        public readonly string CreatedDate;
        public readonly ImmutableDictionary<string, ImmutableArray<string>> CustomLabels;
        /// <summary>
        /// The URL of the service dashboard, which is a web-based management user interface for the service instances.
        /// </summary>
        public readonly string DashboardUrl;
        /// <summary>
        /// The description of the environment instance.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The type of the environment instance that is used.
        /// </summary>
        public readonly string EnvironmentType;
        /// <summary>
        /// The ID of the environment instance.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Broker-specified key-value pairs that specify attributes of an environment instance.
        /// </summary>
        public readonly string Labels;
        /// <summary>
        /// The name of the landscape within the logged-in region on which the environment instance is created.
        /// </summary>
        public readonly string LandscapeLabel;
        /// <summary>
        /// The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        /// </summary>
        public readonly string LastModified;
        /// <summary>
        /// The name of the environment instance.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// An identifier that represents the last operation. This ID is returned by the environment brokers.
        /// </summary>
        public readonly string Operation;
        /// <summary>
        /// The configuration parameters for the environment instance.
        /// </summary>
        public readonly string Parameters;
        /// <summary>
        /// The ID of the service plan for the environment instance in the corresponding service broker's catalog.
        /// </summary>
        public readonly string PlanId;
        /// <summary>
        /// The name of the service plan for the environment instance in the corresponding service broker's catalog.
        /// </summary>
        public readonly string PlanName;
        /// <summary>
        /// The ID of the platform for the environment instance in the corresponding service broker's catalog.
        /// </summary>
        public readonly string PlatformId;
        /// <summary>
        /// The ID of the service for the environment instance in the corresponding service broker's catalog.
        /// </summary>
        public readonly string ServiceId;
        /// <summary>
        /// The name of the service for the environment instance in the corresponding service broker's catalog.
        /// </summary>
        public readonly string ServiceName;
        /// <summary>
        /// The current state of the environment instance. Possible values are:
        /// </summary>
        public readonly string State;
        public readonly string TenantId;
        public readonly string Type;

        [OutputConstructor]
        private GetSubaccountEnvironmentInstancesValueResult(
            string brokerId,

            string createdDate,

            ImmutableDictionary<string, ImmutableArray<string>> customLabels,

            string dashboardUrl,

            string description,

            string environmentType,

            string id,

            string labels,

            string landscapeLabel,

            string lastModified,

            string name,

            string operation,

            string parameters,

            string planId,

            string planName,

            string platformId,

            string serviceId,

            string serviceName,

            string state,

            string tenantId,

            string type)
        {
            BrokerId = brokerId;
            CreatedDate = createdDate;
            CustomLabels = customLabels;
            DashboardUrl = dashboardUrl;
            Description = description;
            EnvironmentType = environmentType;
            Id = id;
            Labels = labels;
            LandscapeLabel = landscapeLabel;
            LastModified = lastModified;
            Name = name;
            Operation = operation;
            Parameters = parameters;
            PlanId = planId;
            PlanName = planName;
            PlatformId = platformId;
            ServiceId = serviceId;
            ServiceName = serviceName;
            State = state;
            TenantId = tenantId;
            Type = type;
        }
    }
}
