const path = require("path");
const webpack = require("webpack");
const htmlWebpackPlugin = require("html-webpack-plugin");

module.exports = {
  mode: "development",
  entry: [
    "webpack/hot/dev-server.js",
    path.join(__dirname, "src/client", "index.tsx"),
  ],
  devtool: "source-map",
  plugins: [
    new webpack.HotModuleReplacementPlugin({ multiStep: true }),
    new htmlWebpackPlugin({
      template: path.join(__dirname, "index.html"),
    }),
  ],
  output: {
    publicPath:"public/",
    path: path.join(__dirname, "dist"),
    filename: "entry-bundle.js",
  },
  resolve: {
    extensions: [".ts", ".js", ".jsx", ".tsx", ".scss", ".css", ".svg"],
  },
  module: {
    rules: [
      {
        test: /\.(ts|tsx)$/,
        exclude: /node_modules/,
        use: [{ loader: "babel-loader" }],
      },
      {
        test: /\.scss$/i,
        use: ["style-loader", "css-loader", "sass-loader"],
      },
    ],
  },
};

// assert: false,
//       buffer: false,
//       console:false,
//       constants: false,
//       crypto: false,
//       domain:false,
//       events: false,
//       http: false,
//       https: false,
//       os:false,
//       path: false,
//       punycode: false,
//       process: false,
//       querystring: false,
//       stream: false,
//       string_decoder: false,
//       sys: false,
//       timers: false,
//       tty: false,
//       url: false,
//       util: false,
//       vm: false,
//       zlib: false,
