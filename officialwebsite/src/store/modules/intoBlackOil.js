const intoBlackOil = {
  state: {
    intoBlackOilPage: 0
  },
  mutations: {
    setIntoBlackOilPage: (state, pageNum) => {
      state.intoBlackOilPage = Number(pageNum);
    }
  },
  actions: {}
}

export default intoBlackOil;
