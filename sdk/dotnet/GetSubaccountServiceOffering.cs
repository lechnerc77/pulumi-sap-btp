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
    public static class GetSubaccountServiceOffering
    {
        /// <summary>
        /// Gets details about a specific service offering such as its ID, name, description, metadata, and the associated service brokers.
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
        ///     var byId = Btp.GetSubaccountServiceOffering.Invoke(new()
        ///     {
        ///         Id = "4e953cf1-7eda-4ebb-a58c-02c6ebfe45fb",
        ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
        ///     });
        /// 
        ///     var byName = Btp.GetSubaccountServiceOffering.Invoke(new()
        ///     {
        ///         Name = "auditlog-management",
        ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSubaccountServiceOfferingResult> InvokeAsync(GetSubaccountServiceOfferingArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSubaccountServiceOfferingResult>("btp:index/getSubaccountServiceOffering:getSubaccountServiceOffering", args ?? new GetSubaccountServiceOfferingArgs(), options.WithDefaults());

        /// <summary>
        /// Gets details about a specific service offering such as its ID, name, description, metadata, and the associated service brokers.
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
        ///     var byId = Btp.GetSubaccountServiceOffering.Invoke(new()
        ///     {
        ///         Id = "4e953cf1-7eda-4ebb-a58c-02c6ebfe45fb",
        ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
        ///     });
        /// 
        ///     var byName = Btp.GetSubaccountServiceOffering.Invoke(new()
        ///     {
        ///         Name = "auditlog-management",
        ///         SubaccountId = "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetSubaccountServiceOfferingResult> Invoke(GetSubaccountServiceOfferingInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSubaccountServiceOfferingResult>("btp:index/getSubaccountServiceOffering:getSubaccountServiceOffering", args ?? new GetSubaccountServiceOfferingInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSubaccountServiceOfferingArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the service offering.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// The name of the service offering.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        [Input("subaccountId", required: true)]
        public string SubaccountId { get; set; } = null!;

        public GetSubaccountServiceOfferingArgs()
        {
        }
        public static new GetSubaccountServiceOfferingArgs Empty => new GetSubaccountServiceOfferingArgs();
    }

    public sealed class GetSubaccountServiceOfferingInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the service offering.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The name of the service offering.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        [Input("subaccountId", required: true)]
        public Input<string> SubaccountId { get; set; } = null!;

        public GetSubaccountServiceOfferingInvokeArgs()
        {
        }
        public static new GetSubaccountServiceOfferingInvokeArgs Empty => new GetSubaccountServiceOfferingInvokeArgs();
    }


    [OutputType]
    public sealed class GetSubaccountServiceOfferingResult
    {
        /// <summary>
        /// Shows whether the context for the service offering can be updated.
        /// </summary>
        public readonly bool AllowContextUpdates;
        /// <summary>
        /// Shows whether the service offering is bindable.
        /// </summary>
        public readonly bool Bindable;
        /// <summary>
        /// Shows whether the bindings associated with the service offering can be retrieved.
        /// </summary>
        public readonly bool BindingsRetrievable;
        /// <summary>
        /// The ID of the broker that provides the service plan.
        /// </summary>
        public readonly string BrokerId;
        /// <summary>
        /// The ID of the service offering as provided by the catalog.
        /// </summary>
        public readonly string CatalogId;
        /// <summary>
        /// The catalog name of the service offering.
        /// </summary>
        public readonly string CatalogName;
        /// <summary>
        /// The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        /// </summary>
        public readonly string CreatedDate;
        /// <summary>
        /// The description of the service offering.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The ID of the service offering.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Shows whether the service instances associated with the service offering can be retrieved.
        /// </summary>
        public readonly bool InstancesRetrievable;
        /// <summary>
        /// The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        /// </summary>
        public readonly string LastModified;
        /// <summary>
        /// The name of the service offering.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Shows whether the offered plan can be updated.
        /// </summary>
        public readonly bool PlanUpdateable;
        /// <summary>
        /// Shows whether the service offering is ready to be advertised.
        /// </summary>
        public readonly bool Ready;
        /// <summary>
        /// The ID of the subaccount.
        /// </summary>
        public readonly string SubaccountId;
        /// <summary>
        /// The list of tags for the service offering.
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetSubaccountServiceOfferingResult(
            bool allowContextUpdates,

            bool bindable,

            bool bindingsRetrievable,

            string brokerId,

            string catalogId,

            string catalogName,

            string createdDate,

            string description,

            string id,

            bool instancesRetrievable,

            string lastModified,

            string name,

            bool planUpdateable,

            bool ready,

            string subaccountId,

            ImmutableArray<string> tags)
        {
            AllowContextUpdates = allowContextUpdates;
            Bindable = bindable;
            BindingsRetrievable = bindingsRetrievable;
            BrokerId = brokerId;
            CatalogId = catalogId;
            CatalogName = catalogName;
            CreatedDate = createdDate;
            Description = description;
            Id = id;
            InstancesRetrievable = instancesRetrievable;
            LastModified = lastModified;
            Name = name;
            PlanUpdateable = planUpdateable;
            Ready = ready;
            SubaccountId = subaccountId;
            Tags = tags;
        }
    }
}