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

    public sealed class GlobalaccountRoleCollectionRoleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the referenced role.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The name of the referenced template app id.
        /// </summary>
        [Input("roleTemplateAppId", required: true)]
        public Input<string> RoleTemplateAppId { get; set; } = null!;

        /// <summary>
        /// The name of the referenced role template.
        /// </summary>
        [Input("roleTemplateName", required: true)]
        public Input<string> RoleTemplateName { get; set; } = null!;

        public GlobalaccountRoleCollectionRoleArgs()
        {
        }
        public static new GlobalaccountRoleCollectionRoleArgs Empty => new GlobalaccountRoleCollectionRoleArgs();
    }
}
