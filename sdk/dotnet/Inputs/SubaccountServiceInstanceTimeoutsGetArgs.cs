// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace PulumiBtp.Btp.Inputs
{

    public sealed class SubaccountServiceInstanceTimeoutsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Timeout for creating the service instance.
        /// </summary>
        [Input("create")]
        public Input<string>? Create { get; set; }

        /// <summary>
        /// Timeout for deleting the service instance.
        /// </summary>
        [Input("delete")]
        public Input<string>? Delete { get; set; }

        /// <summary>
        /// Timeout for updating the service instance.
        /// </summary>
        [Input("update")]
        public Input<string>? Update { get; set; }

        public SubaccountServiceInstanceTimeoutsGetArgs()
        {
        }
        public static new SubaccountServiceInstanceTimeoutsGetArgs Empty => new SubaccountServiceInstanceTimeoutsGetArgs();
    }
}
