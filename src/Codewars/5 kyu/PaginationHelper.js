// TODO: complete this object/class

// The constructor takes in an array of items and a integer indicating how many
// items fit within a single page
function PaginationHelper(collection, itemsPerPage) {
  this.array = collection;
  this.itemsPerPage = itemsPerPage;
}

// returns the number of items within the entire collection
PaginationHelper.prototype.itemCount = function () {
  return this.array.length;
};

// returns the number of pages
PaginationHelper.prototype.pageCount = function () {
  let pageCount = this.array.length / this.itemsPerPage;
  return Math.ceil(pageCount);
};

// returns the number of items on the current page. page_index is zero based.
// this method should return -1 for pageIndex values that are out of range
PaginationHelper.prototype.pageItemCount = function (pageIndex) {
    let item = this.itemCount();
    if (pageIndex >= this.pageCount()) {
      return -1;
    }
    let arr = [];
    let i;
    let el = 0;
    while (item !== el) {
      let a = [];
      for (i = 0; i < this.itemsPerPage; i++) {
        a.push(this.array[el]);
        el++;
        if (item === el) {
          break;
        }
      }
      arr.push(a);
    }

    return arr[pageIndex].length;
};

// determines what page an item is on. Zero based indexes
// this method should return -1 for itemIndex values that are out of range
PaginationHelper.prototype.pageIndex = function (itemIndex) {
  let item = this.itemCount();
  if (item === 0 | itemIndex < 0 || itemIndex > item) {
    return -1;
  }
  let arr = [];
  let i;
  let el = -1;
  while (itemIndex !== el) {
    let a = [];
    for (i = 0; i < this.itemsPerPage; i++) {
        el++;
        a.push(this.array[el]);
      if (itemIndex === el) {
        break;
      }
    }
    arr.push(a);
  }

  return arr.length - 1;
};

let helper = new PaginationHelper([], 0);

console.log(helper.pageIndex(0));
