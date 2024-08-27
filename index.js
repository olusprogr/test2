const test = async () => {
    const data = await fetch('http://ec2-3-73-205-106.eu-central-1.compute.amazonaws.com:3000')
    const res = await data.json()
    console.log(res)
}

console.log(test())