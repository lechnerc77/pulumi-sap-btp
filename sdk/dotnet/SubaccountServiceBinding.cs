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
    /// Creates a service binding, i.e. generates access details to consume a service.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Btp = PulumiBtp.Btp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // create a service binding in a subaccount
    ///     var myBinding = new Btp.SubaccountServiceBinding("myBinding", new()
    ///     {
    ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
    ///         ServiceInstanceId = "8911491d-0e1d-425d-a233-785512602d6f",
    ///     });
    /// 
    ///     // create a parameterized service binding in a subaccount
    ///     var myParameterizedBinding = new Btp.SubaccountServiceBinding("myParameterizedBinding", new()
    ///     {
    ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
    ///         ServiceInstanceId = "8911491d-0e1d-425d-a233-785512602d6f",
    ///         Parameters = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["param_a"] = "",
    ///             ["param_b"] = "",
    ///         }),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// terraform
    /// 
    /// ```sh
    ///  $ pulumi import btp:index/subaccountServiceBinding:SubaccountServiceBinding &lt;resource_name&gt; &lt;subaccount_id&gt;,&lt;service_binding_id&gt;
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import btp:index/subaccountServiceBinding:SubaccountServiceBinding my_binding 6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f,910e9a7d-0fb4-4428-a813-56550e683579
    /// ```
    /// </summary>
    [BtpResourceType("btp:index/subaccountServiceBinding:SubaccountServiceBinding")]
    public partial class SubaccountServiceBinding : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Contains the resources associated with the binding.
        /// </summary>
        [Output("bindResource")]
        public Output<ImmutableDictionary<string, string>> BindResource { get; private set; } = null!;

        /// <summary>
        /// The contextual data for the resource.
        /// </summary>
        [Output("context")]
        public Output<ImmutableDictionary<string, string>> Context { get; private set; } = null!;

        /// <summary>
        /// The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        /// </summary>
        [Output("createdDate")]
        public Output<string> CreatedDate { get; private set; } = null!;

        /// <summary>
        /// The credentials to access the binding.
        /// </summary>
        [Output("credentials")]
        public Output<string> Credentials { get; private set; } = null!;

        /// <summary>
        /// The set of words or phrases assigned to the service binding.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, ImmutableArray<string>>> Labels { get; private set; } = null!;

        /// <summary>
        /// The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        /// </summary>
        [Output("lastModified")]
        public Output<string> LastModified { get; private set; } = null!;

        /// <summary>
        /// The name of the service binding.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The parameters of the service binding as a valid JSON object.
        /// </summary>
        [Output("parameters")]
        public Output<string> Parameters { get; private set; } = null!;

        /// <summary>
        /// Shows whether the service binding is ready.
        /// </summary>
        [Output("ready")]
        public Output<bool> Ready { get; private set; } = null!;

        /// <summary>
        /// The ID of the service instance associated with the binding.
        /// </summary>
        [Output("serviceInstanceId")]
        public Output<string> ServiceInstanceId { get; private set; } = null!;

        /// <summary>
        /// The current state of the service binding. Possible values are:
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        [Output("subaccountId")]
        public Output<string> SubaccountId { get; private set; } = null!;


        /// <summary>
        /// Create a SubaccountServiceBinding resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SubaccountServiceBinding(string name, SubaccountServiceBindingArgs args, CustomResourceOptions? options = null)
            : base("btp:index/subaccountServiceBinding:SubaccountServiceBinding", name, args ?? new SubaccountServiceBindingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SubaccountServiceBinding(string name, Input<string> id, SubaccountServiceBindingState? state = null, CustomResourceOptions? options = null)
            : base("btp:index/subaccountServiceBinding:SubaccountServiceBinding", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lechnerc77/pulumi-btp",
                AdditionalSecretOutputs =
                {
                    "credentials",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SubaccountServiceBinding resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SubaccountServiceBinding Get(string name, Input<string> id, SubaccountServiceBindingState? state = null, CustomResourceOptions? options = null)
        {
            return new SubaccountServiceBinding(name, id, state, options);
        }
    }

    public sealed class SubaccountServiceBindingArgs : global::Pulumi.ResourceArgs
    {
        [Input("labels")]
        private InputMap<ImmutableArray<string>>? _labels;

        /// <summary>
        /// The set of words or phrases assigned to the service binding.
        /// </summary>
        public InputMap<ImmutableArray<string>> Labels
        {
            get => _labels ?? (_labels = new InputMap<ImmutableArray<string>>());
            set => _labels = value;
        }

        /// <summary>
        /// The name of the service binding.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The parameters of the service binding as a valid JSON object.
        /// </summary>
        [Input("parameters")]
        public Input<string>? Parameters { get; set; }

        /// <summary>
        /// The ID of the service instance associated with the binding.
        /// </summary>
        [Input("serviceInstanceId", required: true)]
        public Input<string> ServiceInstanceId { get; set; } = null!;

        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        [Input("subaccountId", required: true)]
        public Input<string> SubaccountId { get; set; } = null!;

        public SubaccountServiceBindingArgs()
        {
        }
        public static new SubaccountServiceBindingArgs Empty => new SubaccountServiceBindingArgs();
    }

    public sealed class SubaccountServiceBindingState : global::Pulumi.ResourceArgs
    {
        [Input("bindResource")]
        private InputMap<string>? _bindResource;

        /// <summary>
        /// Contains the resources associated with the binding.
        /// </summary>
        public InputMap<string> BindResource
        {
            get => _bindResource ?? (_bindResource = new InputMap<string>());
            set => _bindResource = value;
        }

        [Input("context")]
        private InputMap<string>? _context;

        /// <summary>
        /// The contextual data for the resource.
        /// </summary>
        public InputMap<string> Context
        {
            get => _context ?? (_context = new InputMap<string>());
            set => _context = value;
        }

        /// <summary>
        /// The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        /// </summary>
        [Input("createdDate")]
        public Input<string>? CreatedDate { get; set; }

        [Input("credentials")]
        private Input<string>? _credentials;

        /// <summary>
        /// The credentials to access the binding.
        /// </summary>
        public Input<string>? Credentials
        {
            get => _credentials;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _credentials = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("labels")]
        private InputMap<ImmutableArray<string>>? _labels;

        /// <summary>
        /// The set of words or phrases assigned to the service binding.
        /// </summary>
        public InputMap<ImmutableArray<string>> Labels
        {
            get => _labels ?? (_labels = new InputMap<ImmutableArray<string>>());
            set => _labels = value;
        }

        /// <summary>
        /// The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        /// </summary>
        [Input("lastModified")]
        public Input<string>? LastModified { get; set; }

        /// <summary>
        /// The name of the service binding.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The parameters of the service binding as a valid JSON object.
        /// </summary>
        [Input("parameters")]
        public Input<string>? Parameters { get; set; }

        /// <summary>
        /// Shows whether the service binding is ready.
        /// </summary>
        [Input("ready")]
        public Input<bool>? Ready { get; set; }

        /// <summary>
        /// The ID of the service instance associated with the binding.
        /// </summary>
        [Input("serviceInstanceId")]
        public Input<string>? ServiceInstanceId { get; set; }

        /// <summary>
        /// The current state of the service binding. Possible values are:
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        [Input("subaccountId")]
        public Input<string>? SubaccountId { get; set; }

        public SubaccountServiceBindingState()
        {
        }
        public static new SubaccountServiceBindingState Empty => new SubaccountServiceBindingState();
    }
}
