//00:20:30
function solution(case1) {
  const input = case1.split("\n");
  const N = +input.shift();
  const carInfo = input.map((i) => i.trim());
  const visit = Array.from({ length: N }, () => false);
  const map = new Map();

  carInfo.slice(0, N).map((car, index) => {
    map.set(car, index);
  });

  let cur = 0;
  let cnt = 0;

  carInfo.slice(N).map((car) => {
    if (map.get(car) > cur) {
      let flag = false;
      for (let i = 0; i < map.get(car); i++) {
        if (!visit[i]) {
          flag = true;
          cnt++;
          break;
        }
      }
      if (!flag) cur = map.get(car) + 1;
    }
    visit[map.get(car)] = true;
  });

  return cnt;
}

const case1 = `5
ZG206A
PU234Q
OS945CK
ZG431SN
ZG5962J
ZG5962J
OS945CK
ZG206A
PU234Q
ZG431SN`;

console.log(solution(case1));
