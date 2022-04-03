FROM node:14.18.1

WORKDIR /

COPY package.json .

RUN npm install

COPY . .

EXPOSE 3000

VOLUME ["./node_modules"]

CMD ["npm", "run", "dev"]