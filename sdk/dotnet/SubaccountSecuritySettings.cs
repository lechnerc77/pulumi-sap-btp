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
    /// <summary>
    /// Sets the security settings of a subaccount.
    /// 
    /// __Tip:__
    /// You must be administrator of the subaccount.
    /// 
    /// __Further documentation:__
    /// &lt;https://help.sap.com/docs/btp/sap-business-technology-platform/configure-trusted-domains-for-sap-authorization-and-trust-management-service&gt;
    /// &lt;https://help.sap.com/docs/btp/sap-business-technology-platform/configure-token-policy-for-sap-authorization-and-trust-management-service&gt;
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Btp = PulumiBtp.Btp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var subaccount = new Btp.SubaccountSecuritySettings("subaccount", new()
    ///     {
    ///         AccessTokenValidity = 3600,
    ///         CustomEmailDomains = new[]
    ///         {
    ///             "yourdomain.test",
    ///         },
    ///         DefaultIdentityProvider = "sap.custom",
    ///         RefreshTokenValidity = 3600,
    ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
    ///         TreatUsersWithSameEmailAsSameUser = true,
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [BtpResourceType("btp:index/subaccountSecuritySettings:SubaccountSecuritySettings")]
    public partial class SubaccountSecuritySettings : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The validity of the access token.
        /// </summary>
        [Output("accessTokenValidity")]
        public Output<int> AccessTokenValidity { get; private set; } = null!;

        /// <summary>
        /// Set of domains that are allowed to be used for user authentication.
        /// </summary>
        [Output("customEmailDomains")]
        public Output<ImmutableArray<string>> CustomEmailDomains { get; private set; } = null!;

        /// <summary>
        /// The subaccount's default identity provider for business application users.
        /// </summary>
        [Output("defaultIdentityProvider")]
        public Output<string> DefaultIdentityProvider { get; private set; } = null!;

        /// <summary>
        /// The validity of the refresh token.
        /// </summary>
        [Output("refreshTokenValidity")]
        public Output<int> RefreshTokenValidity { get; private set; } = null!;

        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        [Output("subaccountId")]
        public Output<string> SubaccountId { get; private set; } = null!;

        /// <summary>
        /// If set to true, users with the same email are treated as same users.
        /// </summary>
        [Output("treatUsersWithSameEmailAsSameUser")]
        public Output<bool> TreatUsersWithSameEmailAsSameUser { get; private set; } = null!;


        /// <summary>
        /// Create a SubaccountSecuritySettings resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SubaccountSecuritySettings(string name, SubaccountSecuritySettingsArgs args, CustomResourceOptions? options = null)
            : base("btp:index/subaccountSecuritySettings:SubaccountSecuritySettings", name, args ?? new SubaccountSecuritySettingsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SubaccountSecuritySettings(string name, Input<string> id, SubaccountSecuritySettingsState? state = null, CustomResourceOptions? options = null)
            : base("btp:index/subaccountSecuritySettings:SubaccountSecuritySettings", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lechnerc77/pulumi-btp",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SubaccountSecuritySettings resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SubaccountSecuritySettings Get(string name, Input<string> id, SubaccountSecuritySettingsState? state = null, CustomResourceOptions? options = null)
        {
            return new SubaccountSecuritySettings(name, id, state, options);
        }
    }

    public sealed class SubaccountSecuritySettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The validity of the access token.
        /// </summary>
        [Input("accessTokenValidity")]
        public Input<int>? AccessTokenValidity { get; set; }

        [Input("customEmailDomains")]
        private InputList<string>? _customEmailDomains;

        /// <summary>
        /// Set of domains that are allowed to be used for user authentication.
        /// </summary>
        public InputList<string> CustomEmailDomains
        {
            get => _customEmailDomains ?? (_customEmailDomains = new InputList<string>());
            set => _customEmailDomains = value;
        }

        /// <summary>
        /// The subaccount's default identity provider for business application users.
        /// </summary>
        [Input("defaultIdentityProvider")]
        public Input<string>? DefaultIdentityProvider { get; set; }

        /// <summary>
        /// The validity of the refresh token.
        /// </summary>
        [Input("refreshTokenValidity")]
        public Input<int>? RefreshTokenValidity { get; set; }

        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        [Input("subaccountId", required: true)]
        public Input<string> SubaccountId { get; set; } = null!;

        /// <summary>
        /// If set to true, users with the same email are treated as same users.
        /// </summary>
        [Input("treatUsersWithSameEmailAsSameUser")]
        public Input<bool>? TreatUsersWithSameEmailAsSameUser { get; set; }

        public SubaccountSecuritySettingsArgs()
        {
        }
        public static new SubaccountSecuritySettingsArgs Empty => new SubaccountSecuritySettingsArgs();
    }

    public sealed class SubaccountSecuritySettingsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The validity of the access token.
        /// </summary>
        [Input("accessTokenValidity")]
        public Input<int>? AccessTokenValidity { get; set; }

        [Input("customEmailDomains")]
        private InputList<string>? _customEmailDomains;

        /// <summary>
        /// Set of domains that are allowed to be used for user authentication.
        /// </summary>
        public InputList<string> CustomEmailDomains
        {
            get => _customEmailDomains ?? (_customEmailDomains = new InputList<string>());
            set => _customEmailDomains = value;
        }

        /// <summary>
        /// The subaccount's default identity provider for business application users.
        /// </summary>
        [Input("defaultIdentityProvider")]
        public Input<string>? DefaultIdentityProvider { get; set; }

        /// <summary>
        /// The validity of the refresh token.
        /// </summary>
        [Input("refreshTokenValidity")]
        public Input<int>? RefreshTokenValidity { get; set; }

        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        [Input("subaccountId")]
        public Input<string>? SubaccountId { get; set; }

        /// <summary>
        /// If set to true, users with the same email are treated as same users.
        /// </summary>
        [Input("treatUsersWithSameEmailAsSameUser")]
        public Input<bool>? TreatUsersWithSameEmailAsSameUser { get; set; }

        public SubaccountSecuritySettingsState()
        {
        }
        public static new SubaccountSecuritySettingsState Empty => new SubaccountSecuritySettingsState();
    }
}