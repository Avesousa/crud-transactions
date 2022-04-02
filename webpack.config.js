const webpack = require('webpack');
const webpackDevServer = require('webpack-dev-server');
module.exports = {
  mode: "development",
  entry: [
    'webpack/hot/dev-server.js',
    'webpack-dev-server/client/index.js?hot=true&live-reload=true',
    './src/client/index.tsx'
  ],
  devtool: 'inline-source-map',
  devServer: {
    static: './dist',
   // Dev server client for web socket transport, hot and live reload logic
   hot: false,
   client: false,
  },
  plugins: [
    new webpack.HotModuleReplacementPlugin()
  ],
  output: {
    filename: "./entry-bundle.js",
  },
  resolve: {
    extensions: [".ts", ".js", ".jsx", ".tsx", ".scss", ".css", ".svg"],
  },
  module: {
    rules: [
      {
        test: /\.(ts|tsx)$/,
        exclude: /node_modules/,
        use: ["ts-loader"],
      },
      {
        test: /\.scss$/i,
        use: ["style-loader", "css-loader","sass-loader"],
      },
    ],
  },
};