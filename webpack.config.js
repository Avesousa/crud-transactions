const path = require("path");
const webpack = require("webpack");
const htmlWebpackPlugin = require("html-webpack-plugin");
const pathSource = path.join(__dirname, 'src');

module.exports = {
  mode: "development",
  target: "web",
  entry: [
    "webpack/hot/dev-server.js",
    path.join(pathSource, "/client", "index.tsx"),
  ],
  devtool: "source-map",
  devServer:{
    static: path.join(__dirname,"dist"),
    port: 3000,
    hot: true,
    compress: true
  },
  plugins: [
    new webpack.HotModuleReplacementPlugin({ multiStep: true }),
    new htmlWebpackPlugin({
      template: path.join(__dirname, "index.html"),
      inject: 'body'
    }),
  ],
  output: {
    path: path.join(__dirname, "dist"),
    filename: "entry-bundle.js",
    publicPath:"public/"
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
