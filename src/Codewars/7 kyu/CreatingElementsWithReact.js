var React = require("react");

const createElement = (content, tag = "div", props) =>
  React.createElement(tag, props, content);

const createUnorderedList = (list) => {
  let list2 = list.map((content, i) =>
    createElement(content, "li", { key: i })
  );
  return createElement(list2, "ul");
};
