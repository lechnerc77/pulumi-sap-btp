// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp;

import com.lechnerc77.pulumi.btp.btp.DirectoryRoleCollectionAssignmentArgs;
import com.lechnerc77.pulumi.btp.btp.Utilities;
import com.lechnerc77.pulumi.btp.btp.inputs.DirectoryRoleCollectionAssignmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Assigns a user to a role collection on a directory level.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.btp.DirectoryRoleCollectionAssignment;
 * import com.pulumi.btp.DirectoryRoleCollectionAssignmentArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var jd = new DirectoryRoleCollectionAssignment(&#34;jd&#34;, DirectoryRoleCollectionAssignmentArgs.builder()        
 *             .directoryId(&#34;ddfc2206-5f11-48ed-a1ec-29010af70050&#34;)
 *             .roleCollectionName(&#34;Directory Viewer&#34;)
 *             .userName(&#34;john.doe@mycompany.com&#34;)
 *             .build());
 * 
 *         var directoryViewerGroup = new DirectoryRoleCollectionAssignment(&#34;directoryViewerGroup&#34;, DirectoryRoleCollectionAssignmentArgs.builder()        
 *             .directoryId(&#34;ddfc2206-5f11-48ed-a1ec-29010af70050&#34;)
 *             .groupName(&#34;directory-viewer-group&#34;)
 *             .roleCollectionName(&#34;Directory Viewer&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="btp:index/directoryRoleCollectionAssignment:DirectoryRoleCollectionAssignment")
public class DirectoryRoleCollectionAssignment extends com.pulumi.resources.CustomResource {
    /**
     * The name of the attribute to assign.
     * 
     */
    @Export(name="attributeName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> attributeName;

    /**
     * @return The name of the attribute to assign.
     * 
     */
    public Output<Optional<String>> attributeName() {
        return Codegen.optional(this.attributeName);
    }
    /**
     * The value of the attribute to assign.
     * 
     */
    @Export(name="attributeValue", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> attributeValue;

    /**
     * @return The value of the attribute to assign.
     * 
     */
    public Output<Optional<String>> attributeValue() {
        return Codegen.optional(this.attributeValue);
    }
    /**
     * The ID of the directory.
     * 
     */
    @Export(name="directoryId", refs={String.class}, tree="[0]")
    private Output<String> directoryId;

    /**
     * @return The ID of the directory.
     * 
     */
    public Output<String> directoryId() {
        return this.directoryId;
    }
    /**
     * The name of the group to assign.
     * 
     */
    @Export(name="groupName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> groupName;

    /**
     * @return The name of the group to assign.
     * 
     */
    public Output<Optional<String>> groupName() {
        return Codegen.optional(this.groupName);
    }
    /**
     * The identity provider that hosts the user or a group. The default value is `ldap`.
     * 
     */
    @Export(name="origin", refs={String.class}, tree="[0]")
    private Output<String> origin;

    /**
     * @return The identity provider that hosts the user or a group. The default value is `ldap`.
     * 
     */
    public Output<String> origin() {
        return this.origin;
    }
    /**
     * The name of the role collection.
     * 
     */
    @Export(name="roleCollectionName", refs={String.class}, tree="[0]")
    private Output<String> roleCollectionName;

    /**
     * @return The name of the role collection.
     * 
     */
    public Output<String> roleCollectionName() {
        return this.roleCollectionName;
    }
    /**
     * The username of the user to assign.
     * 
     */
    @Export(name="userName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userName;

    /**
     * @return The username of the user to assign.
     * 
     */
    public Output<Optional<String>> userName() {
        return Codegen.optional(this.userName);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DirectoryRoleCollectionAssignment(String name) {
        this(name, DirectoryRoleCollectionAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DirectoryRoleCollectionAssignment(String name, DirectoryRoleCollectionAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DirectoryRoleCollectionAssignment(String name, DirectoryRoleCollectionAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("btp:index/directoryRoleCollectionAssignment:DirectoryRoleCollectionAssignment", name, args == null ? DirectoryRoleCollectionAssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DirectoryRoleCollectionAssignment(String name, Output<String> id, @Nullable DirectoryRoleCollectionAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("btp:index/directoryRoleCollectionAssignment:DirectoryRoleCollectionAssignment", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DirectoryRoleCollectionAssignment get(String name, Output<String> id, @Nullable DirectoryRoleCollectionAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DirectoryRoleCollectionAssignment(name, id, state, options);
    }
}
