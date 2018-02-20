var path = require('path');

module.exports = {
    entry: './src/main/js/teams/teams.js',
    devtool: 'sourcemaps',
    cache: false,
    output: {
        path: __dirname,
        filename: './src/main/resources/static/public/js/bundle.js'
    },
    module: {
        loaders: [
            {
                test: path.join(__dirname, '.'),
                exclude: /(node_modules)/,
                loader: 'babel-loader',
                query: {
                    cacheDirectory: true,
                    presets: ['es2015', 'react']
                }
            }
        ]
    }
};
