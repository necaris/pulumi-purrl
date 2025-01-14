// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.purrl;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumiverse.purrl.PurrlArgs;
import com.pulumiverse.purrl.Utilities;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Pulumi provider for making API calls
 * 
 */
@ResourceType(type="purrl:index:Purrl")
public class Purrl extends com.pulumi.resources.CustomResource {
    /**
     * The body of the request.
     * 
     */
    @Export(name="body", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> body;

    /**
     * @return The body of the request.
     * 
     */
    public Output<Optional<String>> body() {
        return Codegen.optional(this.body);
    }
    /**
     * The CA certificate if server cert is not signed by a trusted CA.
     * 
     */
    @Export(name="caCert", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> caCert;

    /**
     * @return The CA certificate if server cert is not signed by a trusted CA.
     * 
     */
    public Output<Optional<String>> caCert() {
        return Codegen.optional(this.caCert);
    }
    /**
     * The client certificate to use for TLS verification.
     * 
     */
    @Export(name="cert", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cert;

    /**
     * @return The client certificate to use for TLS verification.
     * 
     */
    public Output<Optional<String>> cert() {
        return Codegen.optional(this.cert);
    }
    /**
     * The body of the request.
     * 
     */
    @Export(name="deleteBody", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deleteBody;

    /**
     * @return The body of the request.
     * 
     */
    public Output<Optional<String>> deleteBody() {
        return Codegen.optional(this.deleteBody);
    }
    /**
     * The CA certificate if server cert is not signed by a trusted CA.
     * 
     */
    @Export(name="deleteCaCert", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deleteCaCert;

    /**
     * @return The CA certificate if server cert is not signed by a trusted CA.
     * 
     */
    public Output<Optional<String>> deleteCaCert() {
        return Codegen.optional(this.deleteCaCert);
    }
    /**
     * The client certificate to use for TLS verification.
     * 
     */
    @Export(name="deleteCert", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deleteCert;

    /**
     * @return The client certificate to use for TLS verification.
     * 
     */
    public Output<Optional<String>> deleteCert() {
        return Codegen.optional(this.deleteCert);
    }
    /**
     * The headers to send with the request.
     * 
     */
    @Export(name="deleteHeaders", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> deleteHeaders;

    /**
     * @return The headers to send with the request.
     * 
     */
    public Output<Optional<Map<String,String>>> deleteHeaders() {
        return Codegen.optional(this.deleteHeaders);
    }
    /**
     * Skip TLS verification.
     * 
     */
    @Export(name="deleteInsecureSkipTLSVerify", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> deleteInsecureSkipTLSVerify;

    /**
     * @return Skip TLS verification.
     * 
     */
    public Output<Optional<Boolean>> deleteInsecureSkipTLSVerify() {
        return Codegen.optional(this.deleteInsecureSkipTLSVerify);
    }
    /**
     * The client key to use for TLS verification.
     * 
     */
    @Export(name="deleteKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deleteKey;

    /**
     * @return The client key to use for TLS verification.
     * 
     */
    public Output<Optional<String>> deleteKey() {
        return Codegen.optional(this.deleteKey);
    }
    /**
     * The HTTP method to use.
     * 
     */
    @Export(name="deleteMethod", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deleteMethod;

    /**
     * @return The HTTP method to use.
     * 
     */
    public Output<Optional<String>> deleteMethod() {
        return Codegen.optional(this.deleteMethod);
    }
    /**
     * The response from the API call.
     * 
     */
    @Export(name="deleteResponse", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deleteResponse;

    /**
     * @return The response from the API call.
     * 
     */
    public Output<Optional<String>> deleteResponse() {
        return Codegen.optional(this.deleteResponse);
    }
    /**
     * The expected response code.
     * 
     */
    @Export(name="deleteResponseCodes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> deleteResponseCodes;

    /**
     * @return The expected response code.
     * 
     */
    public Output<Optional<List<String>>> deleteResponseCodes() {
        return Codegen.optional(this.deleteResponseCodes);
    }
    /**
     * The API endpoint to call.
     * 
     */
    @Export(name="deleteUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deleteUrl;

    /**
     * @return The API endpoint to call.
     * 
     */
    public Output<Optional<String>> deleteUrl() {
        return Codegen.optional(this.deleteUrl);
    }
    /**
     * The headers to send with the request.
     * 
     */
    @Export(name="headers", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> headers;

    /**
     * @return The headers to send with the request.
     * 
     */
    public Output<Optional<Map<String,String>>> headers() {
        return Codegen.optional(this.headers);
    }
    /**
     * Skip TLS verification.
     * 
     */
    @Export(name="insecureSkipTLSVerify", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> insecureSkipTLSVerify;

    /**
     * @return Skip TLS verification.
     * 
     */
    public Output<Optional<Boolean>> insecureSkipTLSVerify() {
        return Codegen.optional(this.insecureSkipTLSVerify);
    }
    /**
     * The client key to use for TLS verification.
     * 
     */
    @Export(name="key", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> key;

    /**
     * @return The client key to use for TLS verification.
     * 
     */
    public Output<Optional<String>> key() {
        return Codegen.optional(this.key);
    }
    /**
     * The HTTP method to use.
     * 
     */
    @Export(name="method", refs={String.class}, tree="[0]")
    private Output<String> method;

    /**
     * @return The HTTP method to use.
     * 
     */
    public Output<String> method() {
        return this.method;
    }
    /**
     * The name for this API call.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name for this API call.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The response from the API call.
     * 
     */
    @Export(name="response", refs={String.class}, tree="[0]")
    private Output<String> response;

    /**
     * @return The response from the API call.
     * 
     */
    public Output<String> response() {
        return this.response;
    }
    @Export(name="responseCode", refs={Integer.class}, tree="[0]")
    private Output<Integer> responseCode;

    public Output<Integer> responseCode() {
        return this.responseCode;
    }
    /**
     * The expected response code.
     * 
     */
    @Export(name="responseCodes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> responseCodes;

    /**
     * @return The expected response code.
     * 
     */
    public Output<List<String>> responseCodes() {
        return this.responseCodes;
    }
    /**
     * The API endpoint to call.
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return The API endpoint to call.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Purrl(String name) {
        this(name, PurrlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Purrl(String name, PurrlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Purrl(String name, PurrlArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("purrl:index:Purrl", name, args == null ? PurrlArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Purrl(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("purrl:index:Purrl", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Purrl get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Purrl(name, id, options);
    }
}
