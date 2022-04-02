module.exports = {
  devtool: "source-map",
  entry: "./src/client/src/index.tsx",
  mode: "development",
  output: {
    filename: "./entry-bundle.js",
  },
  resolve: {
    extensions: [".ts", ".js", ".jsx", ".tsx", ".scss", ".css", ".svg"],
  },
  module: {
    rules: [
      {
        test: /\.tsx$/,
        exclude: /(node_modules|bower_components)/,
        use: {
          loader: "babel-loader",
          options: {
            presets: ["@babel/preset-typescript"]
          },
        },
      },
    ],
  },
};
