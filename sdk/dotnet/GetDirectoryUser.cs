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
    public static class GetDirectoryUser
    {
        /// <summary>
        /// Shows registered users in a directory. Users belong to one of the identity providers (IdPs) of the global account.
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
        ///     var someone = Btp.GetDirectoryUser.Invoke(new()
        ///     {
        ///         DirectoryId = "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
        ///         UserName = "john.doe@mycompany.com",
        ///     });
        /// 
        ///     var someoneElse = Btp.GetDirectoryUser.Invoke(new()
        ///     {
        ///         DirectoryId = "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
        ///         Origin = "my-custom-idp",
        ///         UserName = "jane.doe@mycompany.com",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDirectoryUserResult> InvokeAsync(GetDirectoryUserArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDirectoryUserResult>("btp:index/getDirectoryUser:getDirectoryUser", args ?? new GetDirectoryUserArgs(), options.WithDefaults());

        /// <summary>
        /// Shows registered users in a directory. Users belong to one of the identity providers (IdPs) of the global account.
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
        ///     var someone = Btp.GetDirectoryUser.Invoke(new()
        ///     {
        ///         DirectoryId = "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
        ///         UserName = "john.doe@mycompany.com",
        ///     });
        /// 
        ///     var someoneElse = Btp.GetDirectoryUser.Invoke(new()
        ///     {
        ///         DirectoryId = "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
        ///         Origin = "my-custom-idp",
        ///         UserName = "jane.doe@mycompany.com",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetDirectoryUserResult> Invoke(GetDirectoryUserInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDirectoryUserResult>("btp:index/getDirectoryUser:getDirectoryUser", args ?? new GetDirectoryUserInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDirectoryUserArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the directory.
        /// </summary>
        [Input("directoryId", required: true)]
        public string DirectoryId { get; set; } = null!;

        /// <summary>
        /// The identity provider that hosts the user. Only needed for custom identity provider.
        /// </summary>
        [Input("origin")]
        public string? Origin { get; set; }

        /// <summary>
        /// The username of the user.
        /// </summary>
        [Input("userName", required: true)]
        public string UserName { get; set; } = null!;

        public GetDirectoryUserArgs()
        {
        }
        public static new GetDirectoryUserArgs Empty => new GetDirectoryUserArgs();
    }

    public sealed class GetDirectoryUserInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the directory.
        /// </summary>
        [Input("directoryId", required: true)]
        public Input<string> DirectoryId { get; set; } = null!;

        /// <summary>
        /// The identity provider that hosts the user. Only needed for custom identity provider.
        /// </summary>
        [Input("origin")]
        public Input<string>? Origin { get; set; }

        /// <summary>
        /// The username of the user.
        /// </summary>
        [Input("userName", required: true)]
        public Input<string> UserName { get; set; } = null!;

        public GetDirectoryUserInvokeArgs()
        {
        }
        public static new GetDirectoryUserInvokeArgs Empty => new GetDirectoryUserInvokeArgs();
    }


    [OutputType]
    public sealed class GetDirectoryUserResult
    {
        /// <summary>
        /// Shows if the account is still in use.
        /// </summary>
        public readonly bool Active;
        /// <summary>
        /// The ID of the directory.
        /// </summary>
        public readonly string DirectoryId;
        /// <summary>
        /// The e-mail address of the user.
        /// </summary>
        public readonly string Email;
        /// <summary>
        /// The last name of the user.
        /// </summary>
        public readonly string FamilyName;
        /// <summary>
        /// The given name of the user.
        /// </summary>
        public readonly string GivenName;
        /// <summary>
        /// The ID of the user.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The identity provider that hosts the user. Only needed for custom identity provider.
        /// </summary>
        public readonly string Origin;
        /// <summary>
        /// The set of role collections, which are assigned to the user.
        /// </summary>
        public readonly ImmutableArray<string> RoleCollections;
        /// <summary>
        /// The username of the user.
        /// </summary>
        public readonly string UserName;
        /// <summary>
        /// The verification status of the user.
        /// </summary>
        public readonly bool Verified;

        [OutputConstructor]
        private GetDirectoryUserResult(
            bool active,

            string directoryId,

            string email,

            string familyName,

            string givenName,

            string id,

            string origin,

            ImmutableArray<string> roleCollections,

            string userName,

            bool verified)
        {
            Active = active;
            DirectoryId = directoryId;
            Email = email;
            FamilyName = familyName;
            GivenName = givenName;
            Id = id;
            Origin = origin;
            RoleCollections = roleCollections;
            UserName = userName;
            Verified = verified;
        }
    }
}
