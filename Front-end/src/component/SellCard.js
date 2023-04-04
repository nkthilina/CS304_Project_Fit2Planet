import React from 'react'

const SellCard = () => {
    return (
        <div className="col-lg-4 col-sm-6 col-md-6">
            <div className="card shadow">
                <img src="/sell img/shop-11.jpg" className="card-img-top" alt="..." />
                <div className="card-body">
                    <h5 className="card-title">Card title</h5>
                    <p className="card-text small text-muted font-italic">
                        Some quick example text to build on the card title and makeup
                    </p>
                    <h3 className=" text-orange">$544</h3>

                    <ul className="list-inline small">
                        <li className="list-inline-item m-0"> <i className="bi bi-star-fill"></i> </li>
                        <li className="list-inline-item m-0"> <i className="bi bi-star-fill"></i> </li>
                        <li className="list-inline-item m-0"> <i className="bi bi-star-fill"></i> </li>
                        <li className="list-inline-item m-0"> <i className="bi bi-star-fill"></i> </li>
                        <li className="list-inline-item m-0"> <i className="bi bi-star-fill"></i> </li>
                    </ul>

                </div>
            </div>
        </div>
    )
}

export default SellCard