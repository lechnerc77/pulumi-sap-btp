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
    public sealed class GetRegionsValueResult
    {
        /// <summary>
        /// The domain of the data center
        /// </summary>
        public readonly string Domain;
        /// <summary>
        /// The environment that the data center supports. For example: Kubernetes, Cloud Foundry.
        /// </summary>
        public readonly string Environment;
        /// <summary>
        /// The infrastructure provider for the data center. Possible values are:
        /// </summary>
        public readonly string IaasProvider;
        /// <summary>
        /// The ID of the global account.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly string ProvisioningServiceUrl;
        public readonly string Region;
        public readonly string SaasRegistryServiceUrl;
        public readonly bool SupportsTrial;

        [OutputConstructor]
        private GetRegionsValueResult(
            string domain,

            string environment,

            string iaasProvider,

            string id,

            string name,

            string provisioningServiceUrl,

            string region,

            string saasRegistryServiceUrl,

            bool supportsTrial)
        {
            Domain = domain;
            Environment = environment;
            IaasProvider = iaasProvider;
            Id = id;
            Name = name;
            ProvisioningServiceUrl = provisioningServiceUrl;
            Region = region;
            SaasRegistryServiceUrl = saasRegistryServiceUrl;
            SupportsTrial = supportsTrial;
        }
    }
}
