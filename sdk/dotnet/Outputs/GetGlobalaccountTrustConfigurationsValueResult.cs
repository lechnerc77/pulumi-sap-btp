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
    public sealed class GetGlobalaccountTrustConfigurationsValueResult
    {
        /// <summary>
        /// The description of the trust configuration.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The tenant's domain which should be used for user logon.
        /// </summary>
        public readonly string Domain;
        /// <summary>
        /// The origin of the identity provider.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the Identity Authentication tenant the global account is connected to.
        /// </summary>
        public readonly string IdentityProvider;
        /// <summary>
        /// The display name of the trust configuration.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The origin of the identity provider.
        /// </summary>
        public readonly string Origin;
        /// <summary>
        /// The protocol used to establish trust with the identity provider.
        /// </summary>
        public readonly string Protocol;
        /// <summary>
        /// Shows whether the trust configuration can be modified.
        /// </summary>
        public readonly bool ReadOnly;
        /// <summary>
        /// Shows whether the identity provider is currently 'active' or 'inactive'.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The trust type.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetGlobalaccountTrustConfigurationsValueResult(
            string description,

            string domain,

            string id,

            string identityProvider,

            string name,

            string origin,

            string protocol,

            bool readOnly,

            string status,

            string type)
        {
            Description = description;
            Domain = domain;
            Id = id;
            IdentityProvider = identityProvider;
            Name = name;
            Origin = origin;
            Protocol = protocol;
            ReadOnly = readOnly;
            Status = status;
            Type = type;
        }
    }
}