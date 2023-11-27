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
    public static class GetGlobalaccountTrustConfiguration
    {
        /// <summary>
        /// Gets details about a trust configuration.
        /// 
        /// __Tip:__
        /// You must be viewer or administrator of the global account.
        /// 
        /// __Further documentation:__
        /// &lt;https://help.sap.com/docs/btp/sap-btp-neo-environment/platform-identity-provider&gt;
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
        ///     var @default = Btp.GetGlobalaccountTrustConfiguration.Invoke(new()
        ///     {
        ///         Origin = "sap.default",
        ///     });
        /// 
        ///     var custom = Btp.GetGlobalaccountTrustConfiguration.Invoke(new()
        ///     {
        ///         Origin = "terraformint-platform",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetGlobalaccountTrustConfigurationResult> InvokeAsync(GetGlobalaccountTrustConfigurationArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGlobalaccountTrustConfigurationResult>("btp:index/getGlobalaccountTrustConfiguration:getGlobalaccountTrustConfiguration", args ?? new GetGlobalaccountTrustConfigurationArgs(), options.WithDefaults());

        /// <summary>
        /// Gets details about a trust configuration.
        /// 
        /// __Tip:__
        /// You must be viewer or administrator of the global account.
        /// 
        /// __Further documentation:__
        /// &lt;https://help.sap.com/docs/btp/sap-btp-neo-environment/platform-identity-provider&gt;
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
        ///     var @default = Btp.GetGlobalaccountTrustConfiguration.Invoke(new()
        ///     {
        ///         Origin = "sap.default",
        ///     });
        /// 
        ///     var custom = Btp.GetGlobalaccountTrustConfiguration.Invoke(new()
        ///     {
        ///         Origin = "terraformint-platform",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetGlobalaccountTrustConfigurationResult> Invoke(GetGlobalaccountTrustConfigurationInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGlobalaccountTrustConfigurationResult>("btp:index/getGlobalaccountTrustConfiguration:getGlobalaccountTrustConfiguration", args ?? new GetGlobalaccountTrustConfigurationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGlobalaccountTrustConfigurationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The origin of the identity provider.
        /// </summary>
        [Input("origin", required: true)]
        public string Origin { get; set; } = null!;

        public GetGlobalaccountTrustConfigurationArgs()
        {
        }
        public static new GetGlobalaccountTrustConfigurationArgs Empty => new GetGlobalaccountTrustConfigurationArgs();
    }

    public sealed class GetGlobalaccountTrustConfigurationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The origin of the identity provider.
        /// </summary>
        [Input("origin", required: true)]
        public Input<string> Origin { get; set; } = null!;

        public GetGlobalaccountTrustConfigurationInvokeArgs()
        {
        }
        public static new GetGlobalaccountTrustConfigurationInvokeArgs Empty => new GetGlobalaccountTrustConfigurationInvokeArgs();
    }


    [OutputType]
    public sealed class GetGlobalaccountTrustConfigurationResult
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
        private GetGlobalaccountTrustConfigurationResult(
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
