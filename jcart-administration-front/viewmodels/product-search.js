var app = new Vue({
    el: '#app',
    data: {
        pageInfo: '',
        pageNum: 1
    },
    mounted() {
        this.searchProduct();
    },
    methods: {
        handlePageChange(val){
          this.pageNum = val;
          this.searchProduct();
        },
        searchProduct() {
            axios.get('product/search', {
                params: {
                    pageNum: this.pageNum
                }
            })
                .then(function (response) {
                    console.log(response);
                    app.pageInfo = response.data;
                })
                .catch(function (error) {
                    console.log(error);
                });
        }
    },
})