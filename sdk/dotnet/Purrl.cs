// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Pulumiverse.Purrl
{
    /// <summary>
    /// A Pulumi provider for making API calls
    /// </summary>
    [PurrlResourceType("purrl:index:Purrl")]
    public partial class Purrl : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The body of the request.
        /// </summary>
        [Output("body")]
        public Output<string?> Body { get; private set; } = null!;

        /// <summary>
        /// The body of the request.
        /// </summary>
        [Output("deleteBody")]
        public Output<string?> DeleteBody { get; private set; } = null!;

        /// <summary>
        /// The headers to send with the request.
        /// </summary>
        [Output("deleteHeaders")]
        public Output<ImmutableDictionary<string, string>?> DeleteHeaders { get; private set; } = null!;

        /// <summary>
        /// The HTTP method to use.
        /// </summary>
        [Output("deleteMethod")]
        public Output<string?> DeleteMethod { get; private set; } = null!;

        /// <summary>
        /// The response from the API call.
        /// </summary>
        [Output("deleteResponse")]
        public Output<string?> DeleteResponse { get; private set; } = null!;

        /// <summary>
        /// The expected response code.
        /// </summary>
        [Output("deleteResponseCodes")]
        public Output<ImmutableArray<string>> DeleteResponseCodes { get; private set; } = null!;

        /// <summary>
        /// The API endpoint to call.
        /// </summary>
        [Output("deleteUrl")]
        public Output<string?> DeleteUrl { get; private set; } = null!;

        /// <summary>
        /// The headers to send with the request.
        /// </summary>
        [Output("headers")]
        public Output<ImmutableDictionary<string, string>?> Headers { get; private set; } = null!;

        /// <summary>
        /// The HTTP method to use.
        /// </summary>
        [Output("method")]
        public Output<string> Method { get; private set; } = null!;

        /// <summary>
        /// The name for this API call.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The response from the API call.
        /// </summary>
        [Output("response")]
        public Output<string> Response { get; private set; } = null!;

        /// <summary>
        /// The expected response code.
        /// </summary>
        [Output("responseCodes")]
        public Output<ImmutableArray<string>> ResponseCodes { get; private set; } = null!;

        /// <summary>
        /// The API endpoint to call.
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;


        /// <summary>
        /// Create a Purrl resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Purrl(string name, PurrlArgs args, CustomResourceOptions? options = null)
            : base("purrl:index:Purrl", name, args ?? new PurrlArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Purrl(string name, Input<string> id, CustomResourceOptions? options = null)
            : base("purrl:index:Purrl", name, null, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumiverse",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Purrl resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Purrl Get(string name, Input<string> id, CustomResourceOptions? options = null)
        {
            return new Purrl(name, id, options);
        }
    }

    public sealed class PurrlArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The body of the request.
        /// </summary>
        [Input("body")]
        public Input<string>? Body { get; set; }

        /// <summary>
        /// The body of the request.
        /// </summary>
        [Input("deleteBody")]
        public Input<string>? DeleteBody { get; set; }

        [Input("deleteHeaders")]
        private InputMap<string>? _deleteHeaders;

        /// <summary>
        /// The headers to send with the request.
        /// </summary>
        public InputMap<string> DeleteHeaders
        {
            get => _deleteHeaders ?? (_deleteHeaders = new InputMap<string>());
            set => _deleteHeaders = value;
        }

        /// <summary>
        /// The HTTP method to use.
        /// </summary>
        [Input("deleteMethod")]
        public Input<string>? DeleteMethod { get; set; }

        [Input("deleteResponseCodes")]
        private InputList<string>? _deleteResponseCodes;

        /// <summary>
        /// The expected response code.
        /// </summary>
        public InputList<string> DeleteResponseCodes
        {
            get => _deleteResponseCodes ?? (_deleteResponseCodes = new InputList<string>());
            set => _deleteResponseCodes = value;
        }

        /// <summary>
        /// The API endpoint to call.
        /// </summary>
        [Input("deleteUrl")]
        public Input<string>? DeleteUrl { get; set; }

        [Input("headers")]
        private InputMap<string>? _headers;

        /// <summary>
        /// The headers to send with the request.
        /// </summary>
        public InputMap<string> Headers
        {
            get => _headers ?? (_headers = new InputMap<string>());
            set => _headers = value;
        }

        /// <summary>
        /// The HTTP method to use.
        /// </summary>
        [Input("method", required: true)]
        public Input<string> Method { get; set; } = null!;

        /// <summary>
        /// The name for this API call.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("responseCodes", required: true)]
        private InputList<string>? _responseCodes;

        /// <summary>
        /// The expected response code.
        /// </summary>
        public InputList<string> ResponseCodes
        {
            get => _responseCodes ?? (_responseCodes = new InputList<string>());
            set => _responseCodes = value;
        }

        /// <summary>
        /// The API endpoint to call.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public PurrlArgs()
        {
        }
        public static new PurrlArgs Empty => new PurrlArgs();
    }
}